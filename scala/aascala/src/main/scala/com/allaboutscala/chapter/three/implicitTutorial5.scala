package com.allaboutscala.chapter.three

object implicitTutorial5 extends App {

  def totalCost(donutType: String, quantity: Int)(implicit discount: Double, nome: String): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  // the implicit value has to be in scope
  // one way to call it
  implicit val discount: Double = 0.1
  implicit val nome: String = "hehe"
  println(s"the total cost is ${totalCost("Glazed",10)}")
  // another way to call it
  println(s"the total cost is ${totalCost("Glazed",10)(0.2,"hehe")}")


}
