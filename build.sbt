name := """z2j"""

version := "1.0-SNAPSHOT"

lazy val userWeb = (project in file("modules/web/z2jUserWeb")).enablePlugins(PlayScala)

lazy val masterWeb = (project in file("modules/web/z2jMasterWeb")).enablePlugins(PlayScala)

lazy val root = (project in file(".")).enablePlugins(PlayScala).dependsOn(userWeb, masterWeb)

scalaVersion := Common.scalaVersion

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
