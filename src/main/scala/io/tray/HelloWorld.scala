package io.tray

object HelloWorld extends App {

  println("Hello World")

}

sealed trait MyTrait

final case class MyClass(a: Int, b: String) extends MyTrait
final case class MyClass2(b: Int) extends MyTrait
