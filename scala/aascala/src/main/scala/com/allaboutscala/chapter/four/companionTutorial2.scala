package com.allaboutscala.chapter.four

object companionTutorial2 extends App {
  // companion

  class Donut(name: String,productCode: Long){
    def print = println(s"Donut name = $name, productCode = $productCode")

  }
    // companion, name should be identical to class
  object Donut {

    def apply(name: String, productCode: Long): Donut = {
        new Donut(name, productCode)
    }

  }

  /// usage

  val glazed = Donut("Glazed",1111)


}
