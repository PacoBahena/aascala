package com.allaboutscala.chapter.four

object factoryTutorial3 extends App {

  class Donut(name: String, productCode: Option[Long] = None) {
    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

  }

  println("\nStep 2: How to declare class hierarchy through inheritance using extends keyword")

  class GlazedDonut(name: String) extends Donut(name)
  class VanillaDonut(name: String) extends Donut(name)

  // say you want to use a companion

  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }

  // usage

  println("\nStep 4: How to call apply method of companion object which is a factory")
  val glazedDonut = Donut("Glazed Donut")
  println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print

}
