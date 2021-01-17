package com.allaboutscala.chapter.three

object valfuncTutorial15 extends App {


  println("\nStep 1: How to define a higher order function which takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  // define discount function

  def applyDiscount(totalCost: Double): Double = {
    val discount = 2
    totalCost - discount
  }

  println(
    s"""Total cost, with
       | def discount function
       | = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}""".stripMargin)

  // same thing with a val function

  val applyDisc = (totalCost: Double) => {
    val discount = 2
    totalCost - discount
  }

  println(
    s"""the cost is
       | ${totalCostWithDiscountFunctionParameter("Glazed")(5)(applyDisc)}
       |""".stripMargin)
}
