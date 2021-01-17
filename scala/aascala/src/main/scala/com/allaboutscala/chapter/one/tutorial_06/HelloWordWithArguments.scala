package com.allaboutscala.chapter.one.tutorial_06

object HelloWordWithArguments extends App {
  println("Hello Wrodl with Arguments Scala Application!")
  println("Command line arguments are")
  println(args.mkString(", "))
  println(args(1))
}

