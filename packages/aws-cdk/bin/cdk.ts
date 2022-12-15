import { App as CdkApp } from "aws-cdk-lib"
import { CdkStack } from "../lib/cdk-stack"
import "source-map-support/register"

const app = new CdkApp()

const baseDomain = "luismarroquin.com"

new CdkStack(app, "taller-tecmi-main", {
  env: { region: "us-east-1" },
  branch: "main",
  domainURL: `main.tecmi.${baseDomain}`,
})

new CdkStack(app, "taller-tecmi-test", {
  env: { region: "us-east-1" },
  branch: "test",
  domainURL: `test.tecmi.${baseDomain}`,
})
