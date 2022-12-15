import { CfnOutput, Stack, StackProps } from "aws-cdk-lib"
import { Certificate } from "aws-cdk-lib/aws-certificatemanager"
import { OriginAccessIdentity, Distribution, CachePolicy, AllowedMethods, ViewerProtocolPolicy, PriceClass, SecurityPolicyProtocol } from "aws-cdk-lib/aws-cloudfront"
import { S3Origin } from "aws-cdk-lib/aws-cloudfront-origins"
import { Bucket } from "aws-cdk-lib/aws-s3"
import { BucketDeployment, Source } from "aws-cdk-lib/aws-s3-deployment"
import { Construct } from "constructs"
import { join } from "path"

interface MultiStackProps extends StackProps {
  branch: string
  domainURL: string
}

const certificateARN = "arn:aws:acm:us-east-1:057069682979:certificate/11f5438c-f3b8-42f3-8e32-fcbae7ebf564"
const originAccessIdentityID = "E2N0GCPC8GP9M5"
const bucketName = "enrique"

export class CdkStack extends Stack {
  constructor(scope: Construct, id: string, props: MultiStackProps) {
    super(scope, id, props)

    const rootAppFolder = join(__dirname, "..", "..", "app-root", "dist")
    const headerAppFolder = join(__dirname, "..", "..", "app-header", "dist")
    const contentAppFolder = join(__dirname, "..", "..", "app-content", "dist")

    const appRemoteDirectory = `taller-tecmi-${props.branch}`

    console.log({ __dirname, rootAppFolder, headerAppFolder, contentAppFolder, appRemoteDirectory })

    // Get S3 bucket
    const websiteBucket = Bucket.fromBucketName(this, "UseExistingBucket", bucketName)

    // Deploy UI generated code to the bucket
    new BucketDeployment(this, "DeployFrontendRoot", {
      sources: [Source.asset(rootAppFolder)],
      destinationBucket: websiteBucket,
      destinationKeyPrefix: appRemoteDirectory,
    })
    new BucketDeployment(this, "DeployFrontendHeader", {
      sources: [Source.asset(headerAppFolder)],
      destinationBucket: websiteBucket,
      destinationKeyPrefix: `${appRemoteDirectory}/header/`,
    })
    new BucketDeployment(this, "DeployFrontendContent", {
      sources: [Source.asset(contentAppFolder)],
      destinationBucket: websiteBucket,
      destinationKeyPrefix: `${appRemoteDirectory}/content/`,
    })

    const oai = OriginAccessIdentity.fromOriginAccessIdentityId(this, "AccessIdentity", originAccessIdentityID)

    const certificate = Certificate.fromCertificateArn(this, "AmazonCertificate", certificateARN)

    const distribution = new Distribution(this, "CloudFrontDistro", {
      defaultBehavior: {
        origin: new S3Origin(websiteBucket, {
          originPath: `/${appRemoteDirectory}`,
          originAccessIdentity: oai,
        }),
        cachePolicy: CachePolicy.CACHING_DISABLED,
        allowedMethods: AllowedMethods.ALLOW_GET_HEAD_OPTIONS,
        viewerProtocolPolicy: ViewerProtocolPolicy.REDIRECT_TO_HTTPS,
      },
      errorResponses: [
        {
          httpStatus: 403,
          responseHttpStatus: 200,
          responsePagePath: "/index.html",
        },
        {
          httpStatus: 404,
          responseHttpStatus: 200,
          responsePagePath: "/index.html",
        },
      ],
      defaultRootObject: "index.html",
      domainNames: [props.domainURL],
      certificate: certificate,
      priceClass: PriceClass.PRICE_CLASS_100,
      minimumProtocolVersion: SecurityPolicyProtocol.TLS_V1_2_2021,
    })

    new CfnOutput(this, "DistributionName", {
      value: distribution.distributionDomainName,
      description: "Distribution assigned URL",
    })
  }
}
