import Dependencies._
import ScalacOptions._
import MavenResolvers._

scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, minorScalaVersion)) => scalacOptionsPerMinorScalaVersion(minorScalaVersion)
    case _                            => Seq.empty
  }
}
scalacOptions in Test --= excludeInTestScalacOptions

wartremoverWarnings in (Compile, compile) ++= Warts.unsafe

lazy val IntegrationTest = config("it").extend(Test)

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(inConfig(IntegrationTest)(Defaults.testSettings): _*)
  .settings(
    inThisBuild(
      List(
        organization := "io.tray",
        crossScalaVersions := Seq("2.12.11", "2.13.2")
      )
    ),
    name := "empty-project",
    resolvers ++= mavenResolvers,
    libraryDependencies ++= dependencies
  )
