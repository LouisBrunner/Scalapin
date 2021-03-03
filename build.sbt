import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.tsuru"
ThisBuild / organizationName := "tsuru"

lazy val root = (project in file("."))
  .settings(
    name := "sapin",
    libraryDependencies ++= sandboxDeps
  )
