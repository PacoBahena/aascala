package com.allaboutscala.chapter.four

object typealiasTutorial7 extends App {

  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  val glazedDonut: Donut = Donut("Glazed", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  //aliasing of types

  type CartItem = Tuple2[Donut, Int]

  val cart1: CartItem = new CartItem(vanillaDonut, 4)

  println(cart1)
  println(cart1._1)

}
