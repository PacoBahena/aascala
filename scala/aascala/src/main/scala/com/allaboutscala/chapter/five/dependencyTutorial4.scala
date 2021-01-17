package com.allaboutscala.chapter.five

object dependencyTutorial4 extends App {

  trait DonutDatabase[A]{
    def addOrUpdate(donut: A): Long

    def query(donut: A): A

    def delete(donut: A): Boolean
  }

  class CassandraDonutStore[A] extends DonutDatabase[A] {

    override def addOrUpdate(donut:A): Long = {
      println(s"cassandra db add method ")
      1
    }

    override def query(donut: A): A = {
      println(s"cassandra db query")
      donut
    }

    override def delete(donut:A): Boolean = {
      println(s"CassandraDonutDatabase-> delete method -> donut: $donut")
      true
    }
  }

  trait DonutShoppingCartDao[A] {

    val donutDatabase: DonutDatabase[A] // injection declare

    def add(donut: A): Unit ={
      println(s"DonutShoppingCartDao-> add method -> donut: $donut")
      donutDatabase.addOrUpdate(donut)
    }

    def update(donut: A): Boolean = {
      println(s"DonutShoppingCartDao-> update method -> donut: $donut")
      donutDatabase.addOrUpdate(donut)
      true
    }

    def search(donut: A): A = {
      println(s"donut update method ")
      donutDatabase.query(donut)
    }

    def delete(donut: A): Boolean = {
      println(s"DonutShoppingCartDao-> delete method -> donut: $donut")
      donutDatabase.delete(donut)
    }
  }

  trait DonutInventoryService[A] {

    val donutDatabase: DonutDatabase[A]

    def checkStockQuantity(donut: A): Int = {
      println(s"DonutInventoryService-> checkStockQuantity method -> donut: $donut")
      donutDatabase.query(donut)
      1
    }
  }

  //single facade
  trait DonutShoppingCartServices[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {
    override val donutDatabase: DonutDatabase[A] = new CassandraDonutStore[A]()
  }

  // single facade class that extends both traits
  class DonutShoppingCart[A] extends DonutShoppingCartServices[A] {

  }

  val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
  donutShoppingCart.add("Vanilla Donut")
  donutShoppingCart.update("Vanilla Donut")
  donutShoppingCart.search("Vanilla Donut")
  donutShoppingCart.delete("Vanilla Donut")

  donutShoppingCart.checkStockQuantity("Vanilla Donut")

}
