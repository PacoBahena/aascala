package com.allaboutscala.chapter.three

object curriTutorial11 extends App {

  // function curring, allows to apply a function in multiple steps

  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double ={
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _
  println(totalCostForGlazedDonuts)

  println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.1)}")

}
