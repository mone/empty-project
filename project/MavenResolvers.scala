import sbt.{Resolver, _}

object MavenResolvers {

  val mavenResolvers = Seq(
    "Artima Maven Repository".at("https://repo.artima.com/releases"),
    "Tray Snapshots".at("s3://maven.tray.io/snapshots"),
    Resolver.sonatypeRepo("releases"),
    Resolver.typesafeRepo("releases")
  )

}
