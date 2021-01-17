package com.allaboutscala.chapter.four

object inheritanceTutorial10 extends App {

  abstract class Donut(name: String) {

    def printName: Unit

    def testMethod: String

  }

  // how we define the class
  class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)
    override def testMethod: String = "nada de nada"
  }

  // define the companion object

  object VanillaDonut {

    def apply(name: String): Donut ={
      new VanillaDonut(name)
    }

  }

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName
  println(s"wue pedo ${vanillaDonut.testMethod}")
}
