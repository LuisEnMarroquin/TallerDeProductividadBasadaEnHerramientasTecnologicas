import { registerApplication, start, LifeCycles } from "single-spa"

registerApplication({
  name: "@single-spa/welcome",
  app: () => System.import<LifeCycles>("https://unpkg.com/single-spa-welcome/dist/single-spa-welcome.js"),
  activeWhen: ["/"],
})

registerApplication({
  name: "@luisenmarroquin/app-header-project",
  app: () => System.import<LifeCycles>("@luisenmarroquin/app-header-project"),
  activeWhen: ["/"],
})

registerApplication({
  name: "@luisenmarroquin/app-content-project",
  app: () => System.import<LifeCycles>("@luisenmarroquin/app-content-project"),
  activeWhen: ["/"],
})

start({
  urlRerouteOnly: true,
})
