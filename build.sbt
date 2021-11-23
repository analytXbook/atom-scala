name := "atom-scala"

organization := "io.github.martintrojer"

version := "0.2-SNAPSHOT"

scalaVersion := "2.12.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"


publishTo := Some("Artifactory Realm" at "http://10.0.0.244/artifactory/libs-release-local")

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
resolvers += "Artifactory" at "http://10.0.0.244/artifactory/libs-release-local/"
