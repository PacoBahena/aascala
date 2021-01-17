package com.allaboutscala.chapter.five

object avoidCakeTutorial5 extends App {

  class DonutInventoryService[T] {
    def checkStock(donut: T): Boolean = {
      println("Donut Inventory Service")
      true
    }
  }

  class DonutPricingService[T] {
    def calculatePrice(donut:T): Double = {
      println("DonutPricingService->calculatePrice")
      2.50
    }
  }

  class DonutOrderService[T] {
    def createOrder(donut: T, quantity: Int,price: Double): Int = {
      println(s"Saving donut order to database: donut = $donut, quantity = $quantity, price = $price")
      100 // the id of the booked order
    }
  }

  // defining a class to encapsulate shoopping cart services

  class DonutShoppingCartService[T] (
                                    donutInventoryService: DonutInventoryService[T],
                                    donutPricingService: DonutPricingService[T],
                                    donutOrderService: DonutOrderService[T]
                                    ) {
    def bookOrder(donut: T, quantity: Int): Int = {
      donutInventoryService.checkStock(donut) match {
        case true =>
          val price = donutPricingService.calculatePrice(donut)
          donutOrderService.createOrder(donut, quantity, price)
        case false => println(s"sorry $donut is out of stock")
          -100
      }
    }
  }

  // define a trait to encapsulate all functionaluty

  trait DonutStoreServices {
    val donutInventoryService = new DonutInventoryService[String]
    val donutPricingService = new DonutPricingService[String]
    val donutOrderService = new DonutOrderService[String]
    val donutShoppingCartService = new DonutShoppingCartService(donutInventoryService,donutPricingService,donutOrderService)
  }

  trait DonutStoreAppController {
    this: DonutStoreServices =>
      def bookOrder(donut:String, quantity: Int): Int = {
        println("DonutStoreAppController->bookOrder")
        donutShoppingCartService.bookOrder(donut, quantity)
      }
  }


}
