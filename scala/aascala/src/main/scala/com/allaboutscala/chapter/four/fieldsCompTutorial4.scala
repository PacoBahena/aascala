package com.allaboutscala.chapter.four

object fieldsCompTutorial4 extends App {

  // using fields in companion object

  class Donut(name: String, productCode: Option[Long]= None){
    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")
  }

  object Donut {
    private val uuid = 1111
    def apply(name: String, productCode: Option[Long]): Donut ={
      new Donut(name,productCode)
    }
    // two ways of crating donits
    def apply(name: String): Donut ={
      new Donut(name)
    }
  }

  val glazed = Donut("Glazed",Some(1111))
  glazed.print
  val vanilla = Donut("Vanilla")
  vanilla.print

}
