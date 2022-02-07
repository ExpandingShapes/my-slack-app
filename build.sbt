ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "my-slack-app2"
  )

// https://mvnrepository.com/artifact/com.slack.api/bolt-jetty
libraryDependencies += "com.slack.api" % "bolt-jetty" % "1.18.0"
libraryDependencies += "com.slack.api" % "bolt" % "1.18.0"
libraryDependencies += "com.slack.api" % "bolt-servlet" % "1.18.0"
// https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.35"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.35"
