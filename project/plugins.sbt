resolvers += Resolver.sonatypeRepo("public")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")
addSbtPlugin("io.github.soc" % "sbt-testng" % "4.0.0-M3")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14-7")

// Incompatible with 2.12.0-M5
// addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
// addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.1.0")
