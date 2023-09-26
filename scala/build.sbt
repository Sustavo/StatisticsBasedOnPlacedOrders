ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "org.postgresql" % "postgresql" % "42.5.1"
)

lazy val root = (project in file("."))
  .settings(
    name := "scala"
  )
