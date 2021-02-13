name := "Group2-Testing"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

lazy val Company = project.in(file("Company"))
  .settings(
    libraryDependencies ++= Seq( "org.scalatest" %% "scalatest" % "3.2.3" % Test,
        "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    ))