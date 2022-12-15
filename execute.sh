#!/bin/bash

icons="**********"

logFX () {
  printf "\n$icons $* $icons\n\n"
}

logFX Verify AWS CLI
aws --version

logFX Install AWS CDK
npm install -g aws-cdk

logFX Verify AWS CDK
cdk --version

logFX Set AWS region
aws configure set region us-east-1

logFX Set AWS access key id
aws configure set aws_access_key_id "$1"

logFX Set AWS secret access key
aws configure set aws_secret_access_key "$2"

logFX Verify that is authorized
aws sts get-caller-identity

logFX Install all dependencies
yarn install

logFX Building all projects
yarn build

logFX Copy header and footer to root project
cp -R packages/app-header/dist packages/app-root/dist/header
cp -R packages/app-footer/dist packages/app-root/dist/footer
