package com.allaboutscala.chapter.three

object optionTutorial3 extends App {

  // how to  define optional parameterrs ith option

  def calcDonutCost(donutName: String, quantity: Int, coupon: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    coupon match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      case None => 2.50 * quantity
    }

  }

  println(s"El costo total es ${calcDonutCost("Glazed",2)}")

  println(s"""Total cost with discount = ${calcDonutCost("Glazed Donut", 5, Some("COUPON_1234"))}""")

  println(s"\nTip 1: Use the map function to extract a valid Option value")
  val favoriteDonut: Option[String] = Some("Glazed Donut")
  favoriteDonut.map(d=> println(s"Favorite donut = $d"))
  val leastFavDonut: Option[String] = None
  leastFavDonut.map(d => println(s"least favorite donut ${d}"))
}
