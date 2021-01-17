package com.allaboutscala.chapter.three

object ymbsTutorial10 extends App {

  class DonutCostCalculator {
    val totalCost = 100

    def minusDiscount(discount: Double): Double ={
      totalCost - discount
    }

    def -(discount: Double): Double = {
      totalCost - discount
    }

    def +++(taxAmount: Double): Double = {
      totalCost + taxAmount
    }
  }

  val donutCostCalculator = new DonutCostCalculator()
  println(donutCostCalculator.minusDiscount(50))

  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

  println("\nStep 5: How to call a function using the operator style notation")
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")


}
