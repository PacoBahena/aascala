package com.allaboutscala.chapter.three

import scala.util.control.TailCalls._

object trampolinTutorial20 extends App {

  val donutList: List[String] = List("Plain Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  def verySweetDonut(donutList: List[String]): TailRec[Boolean] = {
    if (donutList.isEmpty) {
      println("verySweetDonut function: donut list isEmpty, returning false")
      done(false)
    } else if(Set(donutList.head).subsetOf(Set("Vanilla Donut","Strawberry Donut","Glazed Donut"))) {
        println(s"verySweetDonut function: found donut list's head = ${donutList.head} to be VERY sweet, returning true")
        done(true)
      } else {
      println(s"verySweetDonut function: donut list's head = ${donutList.head} is NOT VERY sweet, forwarding donut list's to notSweetDonut function")
      tailcall(notSweetDonut(donutList))
    }
  }

  def notSweetDonut(donutList: List[String]) = {
    println(s"notSweetDonut function: with donut list ${donutList.mkString(", ")}")
    if(donutList.isEmpty){
      println("notSweetDonut function: Donut List is empty")
      done(false)
    } else {
      println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet,   forwarding donut list's tail to verySweetDonut function")
      tailcall(verySweetDonut(donutList.tail))
    }
  }

  val foundSweet: TailRec[Boolean] = tailcall(verySweetDonut(donutList))
  println(s"calling it ${foundSweet.result}")

}
