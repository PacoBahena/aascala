package com.allaboutscala.chapter.two

import com.typesafe.scalalogging.LazyLogging

object typesTutorial4 extends App with LazyLogging{

  // type inference
  val donutsToBuy = 5


  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()

  // type conversion

  val smallNumberDonuts: Long = smallNumberOfDonuts
  println(s"$smallNumberDonuts")

  // when theres type mismatch, compiler cannot convert

  // val smallNumberDonuts: String = smallNumberOfDonuts

  val smallNumberDonutsToSell: String = smallNumberOfDonuts.toString()

  println(s"$smallNumberDonutsToSell")
}
