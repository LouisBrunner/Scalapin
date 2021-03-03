import Dependencies._

ThisBuild / scalaVersion     := scalaVer
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.tsuru"
ThisBuild / organizationName := "tsuru"

lazy val root = (project in file("."))
  .settings(
    name := "sapin",
    libraryDependencies ++= sapinDeps
  )

enablePlugins(JavaAppPackaging)

inThisBuild(
  List(
    scalaVersion := scalaVer,
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Wdead-code",
  "-Wextra-implicit",
  "-Wunused",
  "-Wvalue-discard",
  "-Xlint",
  "-Xfatal-warnings",
)
