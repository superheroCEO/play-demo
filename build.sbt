name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
//Ply provides two styles of routers, one expects its actions to be injected, the other, legacy style, access its actions statically.
routesGenerator := InjectedRoutesGenerator

enablePlugins(DebianPlugin)
maintainer := "JA <ja@bringbackfit.com>"
packageSummary := "My custom package"
packageDescription := "Package"
