package com.allaboutscala.chapter.eight

object collectTutorial2 extends App {

  println("Step 1: How to initialize a Sequence which contains donut names and prices")
  val donutNP: Seq[Any] = Seq("Plain Donut",1.5,"strasberry",2.0)

  donutNP.collect({
    case d: String => println("nombre de dona")
    case d: Double => println("precio de dona")}
  )

}
