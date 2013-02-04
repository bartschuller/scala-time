organization := "org.scalaj"

name := "scalaj-time"

version := "0.7-SNAPSHOT"

publishMavenStyle := true

crossVersion := CrossVersion.full

scalaVersion := "2.10.0"

scalaBinaryVersion <<= scalaVersion

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2" % "compile"
)

pomExtra := (
  <licenses>
    <license>
      <name>Apache</name>
      <url>http://www.opensource.org/licenses/Apache-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
)

