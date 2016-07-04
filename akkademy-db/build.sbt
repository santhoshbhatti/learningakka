name := """akkademy-db"""

version := "1.0"

scalaVersion := "2.11.7"
// Change this to another test framework if you prefer
//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"



libraryDependencies ++= Seq(
"com.typesafe.akka" %% "akka-actor" % "2.4.1",
"com.typesafe.akka" %% "akka-testkit" % "2.4.1" % "test",
"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

