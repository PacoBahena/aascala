package com.allaboutscala.chapter.two

/**
 *
 *  This was created by paco
 */

import com.typesafe.scalalogging.LazyLogging

object varsTutorial1 extends App with LazyLogging {

  logger.info("This class has some types ")

  val numDonuts: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val tinyDonuts: Short = 1
  val donutPrice: Double = 2.50
  val donutStoreName: String = "jovita"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  // a var ti be modified

  var leastFavorite: String = _
  leastFavorite = "Js"

  println("este es un print")


}
