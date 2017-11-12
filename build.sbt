name := "scalameta-examples"

lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.8",
  resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  libraryDependencies += "org.scalameta" %% "scalameta" % "2.1.2"
)

lazy val root = (project in file("."))
  .settings(commonSettings:_*)