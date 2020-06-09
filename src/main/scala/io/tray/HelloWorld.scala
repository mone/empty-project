package io.tray

import pureconfig._
import pureconfig.generic.auto._
import io.tray.conf.Conf
import io.tray.models.TaggedIntPureConfigFormat
import pureconfig.ConfigSource

object HelloWorld extends App {
  import HelloWorldFormat._

  println(ConfigSource.default.loadOrThrow[Conf])
}

object HelloWorldFormat extends TaggedIntPureConfigFormat

sealed trait MyTrait

final case class MyClass(a: Int, b: String) extends MyTrait
final case class MyClass2(b: Int) extends MyTrait
