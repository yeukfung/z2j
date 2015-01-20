name := """z2japi"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := Common.scalaVersion

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
