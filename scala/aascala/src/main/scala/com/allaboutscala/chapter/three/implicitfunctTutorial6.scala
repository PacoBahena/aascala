package com.allaboutscala.chapter.three

object implicitfunctTutorial6 extends App {

  class DonutString(s: String) {
    def isFavoriteDonut: Boolean = s == "Glazed Donut"

  }

  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")

  // always ncapsulate implicit functions on objects or packages
  object DonutConversions {
    // all strings given will be converted to DonutString classes.
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }

  println("\nStep 3: How to import the String conversion so that it is in scope")

  import DonutConversions._

  println("\nStep 4: How to create String values")

  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  /** since implicit function from the donutConversion object
  extends a string and make it DonutString instance. **/

  println(s"glaxed donut is favorite ? ${glazedDonut.isFavoriteDonut}")
  println(s"vanilla donut is favorite ? ${vanillaDonut.isFavoriteDonut}")
}
