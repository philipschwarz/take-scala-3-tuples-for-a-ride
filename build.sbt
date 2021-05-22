val scala3Version = "3.0.0-RC2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "take-scala-3-tuples-for-a-ride",
    version := "0.1.0",

    scalaVersion := scala3Version,
  )
