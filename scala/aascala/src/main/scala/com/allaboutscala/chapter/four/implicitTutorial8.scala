package com.allaboutscala.chapter.four

object implicitTutorial8 extends App {

  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  val VanillaDonut: Donut = Donut("Vanilla",1.50)
  println(s"Vanilla Donut name = ${VanillaDonut.name}")

  // defining an implicit class to augmend or extend the Donut object

  object DonutImplicits {
    implicit class AugmentedDonut(donut: Donut) {
      def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }
  }

  import DonutImplicits._
  println(s"vanilla donut uuid: ${VanillaDonut.uuid}")

}
