const { merge } = require("webpack-merge")
const singleSpaDefaults = require("webpack-config-single-spa-react-ts")

module.exports = (webpackConfigEnv, argv) => {
  const defaultConfig = singleSpaDefaults({
    orgName: "luisenmarroquin",
    projectName: "app-content-project",
    webpackConfigEnv,
    argv,
  })

  return merge(defaultConfig, {
    // modify the webpack config however you'd like to by adding to this object
    devServer: {
      port: 5560,
    },
  })
}
