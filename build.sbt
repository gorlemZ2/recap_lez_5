organization := "mohole.it"

name := "Exercises Lez2"

version := "1.0-SNAPSHOT"
scalaVersion := "2.11.7"

autoScalaLibrary := false

libraryDependencies ++= Seq()

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines")

crossPaths := false // drop off Scala suffix from artifact names.
autoScalaLibrary := false // exclude scala-library from dependencies

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"
testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)