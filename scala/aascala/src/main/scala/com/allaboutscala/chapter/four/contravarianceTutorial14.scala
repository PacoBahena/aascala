package com.allaboutscala.chapter.four

object contravarianceTutorial14 extends App {

    abstract class Donut(name: String) {
      def printName: Unit
    }

    case class VanillaDonut(name: String) extends Donut(name) {

      override def printName = println(s"hehe name is $name")

    }

    case class GlazedDonut(name: String) extends Donut(name) {

      override def printName = println(s"hehe name is $name")

    }

    println("\nStep 4: How to instantiate Donut objects")
    val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
    vanillaDonut.printName

    val glazedDonut: Donut = VanillaDonut("Glazed Donut")
    glazedDonut.printName

    class ShoppingCart[-D <: Donut] (donuts: Seq[D]) {
      def printCartItems: Unit = {
        //donuts.foreach(d => d.printName)
        donuts.foreach(_.printName)
      }
    }

    val carro: ShoppingCart[VanillaDonut] = new ShoppingCart[Donut](Seq(vanillaDonut,glazedDonut))
    carro.printCartItems



}
