import sbt._

object Dependencies {
  val scalaVer = "2.13.4"

  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2" % Test
  val scalaMock = "org.scalamock" %% "scalamock" % "5.1.0" % Test

  lazy val AkkaVersion = "2.6.13"
  val akka = Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  )

  lazy val MacWireVersion = "2.3.7"
  val macWire = Seq(
    "com.softwaremill.macwire" %% "macros" % MacWireVersion % "provided",
    "com.softwaremill.macwire" %% "macrosakka" % MacWireVersion % "provided",
    "com.softwaremill.macwire" %% "util" % MacWireVersion,
    "com.softwaremill.macwire" %% "proxy" % MacWireVersion,
  )

  val cats = "org.typelevel" %% "cats-core" % "2.1.1"

  var sapinDeps = Seq(
    scalaTest,
    scalaMock,
    cats,
  ) ++ akka ++ macWire
}
