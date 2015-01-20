name := """z2jUserWeb"""

version := "1.0-SNAPSHOT"

lazy val core = (project in file("../z2jcore")).enablePlugins(PlayScala)

lazy val api = (project in file("../z2japi")).enablePlugins(PlayScala).dependsOn(core)

lazy val root = (project in file(".")).enablePlugins(PlayScala).dependsOn(core, api)

scalaVersion := Common.scalaVersion

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
