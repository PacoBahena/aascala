package com.allaboutscala.chapter

package object four {
  println(s"how to define a case class ")

  case class Donut(name:  String, price: Double, productCode: Option[Long] = None)

  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }

  type DateTime = org.joda.time.DateTime

}
