package com.allaboutscala.chapter.two

object patternTutorial9 extends App {

  val donutType = "Glaze"

  val tasteLevel = donutType match {
    case "Glazed Donut" | "Glaze" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "normal"
  }

  println(tasteLevel)

  // mixing with if

  val dType = "Glaze strawberry"

  val tLevel = dType match {
    case "Glazed Donut" | "Glaze" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case donut if (donut.contains("Strawberry") | donut.contains("mango")) => "super tasty"
    case _ => "normal"
  }

  println(tLevel)

  // type pattern matching

  val priceDonut: Any = 2.50

  val priceType = priceDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }

  println(s"Donut price type is: $priceType")


}
