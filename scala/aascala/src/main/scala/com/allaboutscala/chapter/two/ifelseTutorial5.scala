package com.allaboutscala.chapter.two

import com.typesafe.scalalogging.LazyLogging

object ifelseTutorial5 extends App with LazyLogging {

  // if else example

  val numberOfPeople: Int = 20
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy ${numberOfPeople * donutsPerPerson}")

  // remaining case


  if(numberOfPeople > 10)
    println(s"Number of donuts to buy ${numberOfPeople * donutsPerPerson}")
  else
    println("donuts are enough")

  // formal way of if else, think javascript

  if(numberOfPeople > 10){
    println(s"Number of donuts to buy ${numberOfPeople * donutsPerPerson}")
  } else if(numberOfPeople >20) {
    println("donuts are too much")
  } else {
    println("donuts are enough")
  }

  // inline if else

  val donutsToBuy: Int = if(numberOfPeople > 10)(numberOfPeople * donutsPerPerson) else 0
  println(s"Donuts to buy $donutsToBuy")
}
