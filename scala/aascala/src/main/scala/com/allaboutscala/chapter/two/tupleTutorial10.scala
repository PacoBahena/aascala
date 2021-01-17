package com.allaboutscala.chapter.two

object tupleTutorial10 extends App {

  // using tuples

  println("Step 1: Using tuple2")

  val mydonut = Tuple3("Glazed Donut",10,"hehe")
  println(mydonut)
  println(s"Glazed Donut with 2 data points = $mydonut")
  println(mydonut._1)
  println(mydonut._2)

  // you can use tuple to store more points according to need.
  // actually, you can just write them as needed.
  // example
  val customT = (3.0,"strasdf",1000,"sdaf")

  // pattern matching with tuples

  val strawberryDonut = Tuple3("Strawberry Donut",100,"not so tasty")

  val plainDonut = ("plain donut",50,"equis")
  
  val donutList = List(mydonut, strawberryDonut, plainDonut)

  println(donutList)

  donutList.foreach { tuple =>
    tuple match {
      case ("plain donut", price, taste) => println(s"plain donut price : $price")
      case d if d._1 == "Strawberry Donut" => println(s"strawberry donut price is: ${d._2}")
      case _ => None
    }
  }
    // can also be written as 

    donutList.foreach { 
        case ("plain donut",price,taste) => println(s"plain donut price : $price")
        case d if d._1 == "Strawberry Donut" => println(s"strawberry donut price is: ${d._2}")
        case _ => None
      }

}
