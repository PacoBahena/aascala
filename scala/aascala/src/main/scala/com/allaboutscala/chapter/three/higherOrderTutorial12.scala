package com.allaboutscala.chapter.three

object higherOrderTutorial12 extends App {

  // passing a function as a parameter to a functions ç

  def totalDCost(donutType: String)(quantity: Int)(discount: Double=> Double): Double = {
    val totalCost = 2.50 * quantity
    discount(totalCost)
  }

  // say you want to pass an anonymous function

  val totalCostDonuts = totalDCost("Glazed")(2){totalCost =>
    val discount = 2
    totalCost - discount
  }

  println(totalCostDonuts)

  // best practice is to pass a defined function

  def discount(total: Double): Double = {
    total * .8
  }

  val totalCostDonuts2 = totalDCost("Glazed")(2)(discount)
  println(totalCostDonuts2)


}
