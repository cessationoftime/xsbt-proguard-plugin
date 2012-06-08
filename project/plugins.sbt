resolvers += Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

//libraryDependencies <+= sbtVersion("org.scala-tools.sbt" %% "scripted-plugin" % _)
//needed for sbt > 0.11.2
libraryDependencies <+= sbtVersion("org.scala-sbt" %% "scripted-plugin" % _)
