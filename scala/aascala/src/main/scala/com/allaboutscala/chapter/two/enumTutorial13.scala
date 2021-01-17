package com.allaboutscala.chapter.two

object enumTutorial13 extends App {

  // basic creation of enumeration

  object Donut extends Enumeration {
    type Donut = Value

    val Glazed = Value("Glazed")
    val Strawberry = Value("Strawberry")
    val Plain = Value("Plain")
    val Vanilla = Value("Vainilla")

  }

  println("the string value of the enum")
  println(s"Vanilla donut: ${Donut.Vanilla.id} and ${Donut.Vanilla}")
  print("\n print all values of enum: ")
  println(s"The values are ${Donut.values}")

  Donut.values.foreach{
    case d if (d== Donut.Strawberry || d == Donut.Glazed) => println("fresa o glaseada")
    case _ => None
  }

  object Donas extends Enumeration {
    type Donas = Value

    val Tasty = Value(0,"tasty")
    val VeryTasty = Value(1, "Very Tasty")
    val Ok = Value(-1,"Ok")
  }

  println(s"Donut taste values ${Donas.values}")
  println(s"Donut taste of ok id = ${Donas.Ok.id}")
}
