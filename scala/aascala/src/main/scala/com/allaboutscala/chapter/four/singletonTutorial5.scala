package com.allaboutscala.chapter.four

object singletonTutorial5 extends App {

  object CartCalculator {
    val discount: Int = 0

    def calcDiscount(monto: Double): Double = {
      monto - 50.0
    }
  }

  println(s"calling object val discount ${CartCalculator.discount}")
  println(s"calling object func ${CartCalculator.calcDiscount(100.0)}")

}
