package com.allaboutscala.chapter.four

object caseTutorial6 extends App {

  // case class cfreates class with accesor methods,
  // has equeal
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  val vanillaD: Donut = Donut("vani",100.0)
  val chocoD: Donut = Donut("choco",200.0,Some(111))

  println(s"accesor built in with case class: ${chocoD.name}")

  // define a map with donut type and tastiness

  val shoppingCart: Map[Donut, Int] = Map(vanillaD -> 4,chocoD -> 5)

  println(shoppingCart(vanillaD))

  println("\nTIP: How to create a new object of Donut by using the copy() method of the case class")
  val chocolateVanillaDonut: Donut = vanillaD.copy(name = "Chocolate And Vanilla Donut", price = 5.0)
  println(s"Chocolate And Vanilla Donut = $chocolateVanillaDonut")

}
