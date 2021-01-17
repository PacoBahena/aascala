package com.allaboutscala.chapter.four

object caseclassInheritanceTutorial11 extends App {

  abstract class Donut(name: String) {
    def printName: Unit
  }

  case class VanillaDonut(name: String) extends Donut(name) {
    override def printName: Unit = println(name)
  }

  val vani: VanillaDonut = VanillaDonut("vaivai")

  vani.printName

}
