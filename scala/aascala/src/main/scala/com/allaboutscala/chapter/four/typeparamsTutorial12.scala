package com.allaboutscala.chapter.four

object typeparamsTutorial12 extends App {

  abstract class Donut(name: String){
     def printName: Unit
  }

  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  println("\nStep 5: How to define a ShoppingCart typed class which expects Donut types")

  class ShoppingCart[D <: Donut](donuts: Seq[D]){
    // note that _.printName is short for val d: Donut => d.printName
    def printCartItems: Unit = donuts.foreach(_.printName)
  }

  val donutSeq: Seq[Donut] = Seq[Donut](glazedDonut, vanillaDonut)

  val carro: ShoppingCart[Donut] = new ShoppingCart(donutSeq)
  carro.printCartItems



}
