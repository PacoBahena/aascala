package com.allaboutscala.chapter.three

object compFuncTutorial16 extends App {
  val totalCost: Double = 10

  val applyDiscountValFunction = (amount: Double) => {
    println("Apply Discount Function")
    val discount = 2
    amount - discount
  }
  println("calling the val func")
  println(s"the totalcost is ${applyDiscountValFunction(totalCost)}")

  val applyTaxValFunction = (amount: Double) => {
    val tax = 1
    amount + tax
  }

  // how to call andThen, which is a feature of val functions

  println("To call andThen on a val function")
  println(" f(x) andThen g(x) = g(f(x))")

  println(s"Total cost of 5 donuts ${(applyDiscountValFunction
    andThen applyTaxValFunction)(totalCost)}")
}
