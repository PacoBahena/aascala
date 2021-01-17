package com.allaboutscala.chapter.three

object typedFunctionsTutorial7 extends App {

  def applyDiscount(couponCode: String) = {
    println(f"coupon code is $couponCode")

  }

  def applyDiscount(pdiscount: Double)= {
    println(f"coupon code is $pdiscount")

  }

  applyDiscount("asdfsaf")
  applyDiscount(pdiscount = 2.5)

  // this sucks, to prevent this

  def betterApplyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String =>
        println(f"coupon code is $d")
      case d: Double =>
        println(s"discount is $d")
      case _ =>
        println("no type supported ")

    }
  }

  betterApplyDiscount[String]("dasdfsdf")
  betterApplyDiscount[Double](2.5)

}
