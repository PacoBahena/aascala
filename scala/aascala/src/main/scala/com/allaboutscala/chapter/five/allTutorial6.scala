package com.allaboutscala.chapter.five

object allTutorial6 extends App {

  // Step 1: Define a wrapper object called Cakes to hold various types of cakes
  object Cakes {

    // Step 2: Define a base trait to represent a Cake
    trait Cake {
      def name:String
    }

    class UnknownCake extends Cake {
      override def name: String = "Unknown cake .. but still deli"
    }

    class Cupcake extends Cake {
      override def name: String = "Cupcake"
    }

    class Donut extends Cake {
      override def name: String = "im a donut"
    }
  }

  object CakeFactory {
    import Cakes._

    //define an apply  method to use as a factory
    def apply(cake: String): Cake = {
      cake match {
        case "Cupcake" => new Cupcake
        case "donut" => new Donut
        case _ => new UnknownCake
      }
    }
  }

  val midona = CakeFactory("Cupcake")
  println(midona.getClass)


}
