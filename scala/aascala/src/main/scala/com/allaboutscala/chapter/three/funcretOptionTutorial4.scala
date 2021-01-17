package com.allaboutscala.chapter.three

object funcretOptionTutorial4 extends App {
  // function that returns option

  def dailyCouponCode(): Option[String] = {
    val couponFromDb = "Acsadf"
    Option(couponFromDb).filter(_.nonEmpty)
  }

  // one way to call it
  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"Todays coupon code = ${todayCoupon.getOrElse("No Coupons Today")}")

  // using pattern matching
  dailyCouponCode() match {
    case Some(couponCode) => println(s"Todays coupon is $couponCode")
    case None => println("No coupon today")
  }

  // using map

  dailyCouponCode().map(c => println(s"the coupong is $c"))

  // integrating knowledge
  println("\nStep 5: Review function from previous tutorial which has an Option parameter")
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

  println(s"""Total cost with daily coupon code = ${calculateDonutCost("Glazed Donut", 5, dailyCouponCode())}""")

  println(s"\nTip - 1: Call function with Option return type using fold")

  val todayCouponUsingFold: String = dailyCouponCode().fold("No cupon now")(couponCode => couponCode)
  println(todayCouponUsingFold)
}
