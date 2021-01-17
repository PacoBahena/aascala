package com.allaboutscala.chapter.eight

object aggTutorial1 extends App {

  println("Step 1: How to initialize a Set of type String to represent Donut elements")

  val donutBasket1: Set[String] = Set("plain","chico","mamey")

  //donutBasket1.foreach(d => println(d))

  //acumulator function
  val donutLengthAccum: (Int,String) => Int = {
    (accumulator,donutName) => accumulator + donutName.length
  }

  val tl = donutBasket1.aggregate(0)(donutLengthAccum, _ + _)
  println(tl)

  val donutBasket2: Set[(String, Double, Int)] = Set(("choco",2.0, 1), ("casdo",3.0, 5))
  println(s"the donutbasket2 is ${donutBasket2}")

  // acum function to get the cost of all donut types

  val getCost: (Double,Double,Int) => Double = {
    (accumulator, price, quantity) => accumulator + (price * quantity)
  }

  val costo: Double = donutBasket2.aggregate(0.0)((accumulator: Double, tuple: (String,Double,Int)) => getCost(accumulator, tuple._2, tuple._3),_+_)
  println(costo)

}
