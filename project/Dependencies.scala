import sbt._

object Dependencies {

  val scalaTestVersion = "3.1.1"
  val pureConfigVersion = "0.12.3"
  val shapelessVersion = "2.3.3"

  val dependencies = Seq(
    // format: OFF
    "com.github.pureconfig" %% "pureconfig"               % pureConfigVersion,
    "com.chuusai"           %% "shapeless"                % shapelessVersion,
    "org.scalactic"         %% "scalactic"                % scalaTestVersion    % Test,
    "org.scalatest"         %% "scalatest"                % scalaTestVersion    % Test
    // format: ON
  )

}
