package com.allaboutscala.chapter.four

object classTutorial1 extends App {

  // class definition
  class Donut(name: String, productCode: Long){
    def print = println(s"Donut name is $name")

  }

  // create instances of donut class

  val glazed = new Donut("Glazed",1111)
  val vanillaDonut = new Donut("Vanilla",2222)

  glazed.print
  vanillaDonut.print

  // you cannot access the attributes directly.
  // glazed.name

}
