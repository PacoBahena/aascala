package com.allaboutscala.chapter.three

object functionsTutorial1 extends App {

  println(s"How to define a function ")

  def favoriteDonut(): String ={
    "Glazed Donut"
  }

  val favorita = favoriteDonut()

  println(s"${favorita}")

  // another way, usually for no side effects you do not use parenthesis

  def leastFavoriteDonut = "choco"
  println(s"la menos favorita es ${leastFavoriteDonut}")

  // define function with no return type

  def printDonutSalesReport(): Unit = {
    println("lookup done")
  }

  printDonutSalesReport


}
