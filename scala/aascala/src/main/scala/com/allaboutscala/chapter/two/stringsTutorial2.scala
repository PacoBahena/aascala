package com.allaboutscala.chapter.two

object stringsTutorial2 extends App {

  println("Using String interpolation to print Variables")

  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  println("Using string interpolation on objects")

  case class Donut(name: String, flavor: String)
  val dona = Donut("choco","vainilla")
  println(s"la dona se llama ${dona.name} y sabe a ${dona.flavor}")

  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  println("Using interpolation to evaluate expressions:\n")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts ?: ${qtyDonutsToBuy == 10}")

  println("interpolation to format numbers: \n")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Donut price = $donutPrice%.2f")

  println("Using raw interpolation: \n")
  println(raw"Esta no es un tab \t $donutPrice")
  println(s"Esta no es un tab \t $donutPrice")
}
