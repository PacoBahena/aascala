package com.allaboutscala.chapter.three

import scala.util.Random

object nameTutorial13 extends App {
  val listOrders = List(("Glazed Donut", 5, 2.50),
    ("Vanilla Donut", 10, 3.50))

  def placeOrder(orders: List[(String,Int,Double)])(exchangeRate: Double): Double = {

    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  placeOrder(listOrders)(2)

  /// call by name
  println("\nStep 4: How to define a call-by-name function")
  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  // define the exchange rate function

  val randomExchangeRate = new Random(10)

  def usdToGbp: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(s"Fetching usd to gbp exchange rate $rate")
    rate
  }

  println(s"Total cost of order = £${placeOrderWithByNameParameter(listOrders)(usdToGbp)}")


}
