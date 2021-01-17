package com.allaboutscala.chapter.three

object partialTutorial21 extends App {
  // remember pattern matching ?
  println("Step 1: Review of Pattern Matching in Scala")
  val donut = "Glazed Donut"
  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")

  // same thing with partial functions

  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }

  println("\nStep 3: How to call the Partial Function named isVeryTasty")
  println(s"calling partial function isveryTasty = ${isVeryTasty("Glazed Donut")}")

  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => s"Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut @ _ => s"Unknown taste for donut = $donut"
  }

  // calling it

  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste


  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))

}
