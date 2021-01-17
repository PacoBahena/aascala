package com.allaboutscala.chapter.three

import scala.util.control.TailCalls._

object tailcallsTutorial19 extends App {

  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  // same functions as past tutorial but this time with tail calls

  def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(donuts.length == index) {
      done(None)
    } else if (donuts(index) == donutName) {
      done(Some(true))
    } else {
      val nextIndex = index + 1
      // tailcall is imported from tailcalls above
      tailcall(tailSearch(donutName, donuts, nextIndex))
    }
  }

  println(s"calling tails ${tailcall(tailSearch("Vanilla Donut",arrayDonuts,0)).result}")
  println(s"calling tails ${tailcall(tailSearch("choco",arrayDonuts,0)).result}")
}
