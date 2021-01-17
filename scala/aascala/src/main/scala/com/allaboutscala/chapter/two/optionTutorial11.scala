package com.allaboutscala.chapter.two

object optionTutorial11 extends App {

  // option usage

  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut Taste = ${glazedDonutTaste.get}")

  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name ${glazedDonutName.getOrElse("GlazedDonut")}")

  // you can also use pattern matching

  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None => println(s"No donut name was found!")
  }

  // tip using map, as you can see if none it does not print.

  glazedDonutTaste.map( taste => println(s"glazedDonutTaste = $taste"))
  glazedDonutName.map(name => println(s"glazeddonutName = $name"))


}
