package com.allaboutscala.chapter.three

object polymorphTutorial8 extends App {

  // returning also generic type

  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount $d")
        Seq[T](discount)
      case d: Double =>
        println(s"discount will be applied $d")
        Seq[T](discount)
      case d @ _ =>
        println(s"unsupported discount type")
        Seq[T](discount)

    }
  }

  println("\nStep 4: How to call a generic typed function which also has a generic return type")
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println()
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")


}
