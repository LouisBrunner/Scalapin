import sbt._

object Dependencies {
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"

  lazy val AkkaVersion = "2.6.13"
  val akka = Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
  )

  val cats = "org.typelevel" %% "cats-core" % "2.1.1"

    var sandboxDeps = Seq(
      scalaTest % Test,
      cats
    ) ++ akka
}
