package com.allaboutscala.chapter.three

object nestedTutorial22 extends App {

    // hardcoding
  def checkDonutAvailability(donutName: String): Boolean = {
    val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)
    iDonutInStock
  }

  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")

  // nested case

  def checkDonutNested(donutName: String): Boolean = {
    val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)

    isDonutInStock
  }

  println(checkDonutNested("Vanilla Donut"))

}
