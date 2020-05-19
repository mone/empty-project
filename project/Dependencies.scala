import sbt._

object Dependencies {

  val scalaTestVersion = "3.1.1"

  val dependencies = Seq(
    // format: OFF
    "org.scalactic"         %% "scalactic"                % scalaTestVersion    % Test,
    "org.scalatest"         %% "scalatest"                % scalaTestVersion    % Test
    // format: ON
  )

}
