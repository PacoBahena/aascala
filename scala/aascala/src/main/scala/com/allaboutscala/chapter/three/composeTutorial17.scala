package com.allaboutscala.chapter.three

object composeTutorial17 extends App {

  // now we will use function composition with compose
  val totalCost: Double = 10

  println("\nStep 2: How to define a val function to apply discount to total cost")
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }

  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }

  println("To call compose on a val function")
  println(" f(x) compose g(x) = f(g(x))")

  println(s"Total cost = ${(applyDiscountValFunction compose applyTaxValFunction)(totalCost)}")

}
