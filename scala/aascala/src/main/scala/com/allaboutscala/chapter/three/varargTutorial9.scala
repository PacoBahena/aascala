package com.allaboutscala.chapter.three

object varargTutorial9 extends App {
  // defining functions with variable number of arguments

  def printReport(names: String*) = {
    println(s"""Donut Report = ${names.mkString(", ")}""")
  }

  printReport("Paco","Suly","Ale")

  // say you want to pass a list

  val listDonuts: List[String] = List("Glazed","Choco")

  printReport(listDonuts: _*)

  // same for sequences

  val seqDonuts: Seq[String] = Seq("Chco","Fresa")
  printReport(seqDonuts: _*)

  val arrDonuts: Array[String] = Array("Coconu","straw")
  printReport(arrDonuts: _*)

}
