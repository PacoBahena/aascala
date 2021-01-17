package com.allaboutscala.chapter.three

object tailrecurTutorial18 extends App {

  val arrayDonuts: Array[String] = Array("Glazed","Vainilla","Choco")

  // definition of tail recursive

  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if (donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  // calling the function

  println(s"is simple in array ? ${search("simple",arrayDonuts,0).getOrElse("not found")}")
  println(s"is choco in array ? ${search("Choco",arrayDonuts,0).getOrElse("not found")}")

}
