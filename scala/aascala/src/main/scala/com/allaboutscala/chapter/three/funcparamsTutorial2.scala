package com.allaboutscala.chapter.three

object funcparamsTutorial2 extends App {

  def calcDonutCost(donutName: String = "Glazeada", quantity: Int): Double ={
    2.5 * quantity
  }

  val totalCost = calcDonutCost("webona",3)

  val d2Cost = calcDonutCost(quantity = 2)
  println(d2Cost)
}
