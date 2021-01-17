package com.allaboutscala.chapter.two

object rangeTutorial7 extends App {

  println("step 1 ranges")

  val r1 = 1 to 5
  println(s"the range from 1 to 5 inclusive= $r1")

  val r2 = 1 until 5
  println(r2.getClass())
  println(r2)

  // now by increments

  val r3 = 0 to 10 by 2

  for(num <- r3) {
    println(s"el num es: $num")
  }

  // you can also use the alphabet

  val r4 = 'a' to 'z'

  for(let <- r4){
    println(s"$let")
  }

  // you can also use the alphabet with steps

  val r5 = 'a' to 'z' by 3

  for(let <- r5){
    println(s"$let")
  }

  // playing with collections

  val listr1 = (1 to 5).toList
  println(listr1.getClass)
  println(s"listr1 ${listr1.mkString(", ")}")

  val setr1 = (1 to 5).toSet
  println(setr1.getClass)
  println(s"setr1 ${setr1.mkString(", ")}")

  val seqr1 = (1 to 5).toSeq
  println(seqr1.getClass)
  println(s"seqr1 is ${seqr1.mkString(", ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(arrayFrom1To5.getClass)
  println(s"ar1 is ${arrayFrom1To5.mkString(", ")}")
}
