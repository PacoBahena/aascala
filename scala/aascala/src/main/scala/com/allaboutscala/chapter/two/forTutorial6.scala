package com.allaboutscala.chapter.two

object forTutorial6 extends App {

  println("Simple for example")

  for(numberOfDonuts <- 1 to 5){
    println(s"number donuts to buy: $numberOfDonuts")
  }

  println("not included last limit")

  for(numberOfDonuts <- 1 until 5){
    println(s"number donuts to buy: $numberOfDonuts")
  }

  // mixing for with if

  println("\n filtering with if ")

  val donutIngredients: List[String] = List("flour",
                                            "sugar",
                                            "egg yolks",
                                            "syrup",
                                            "flavoring")

  for(ingredient <- donutIngredients if ingredient == "sugar"){
    println(s"there is one sweet ingredient: $ingredient")
  }

  // adding conditions and using yield

  println(
    """\n Step4: Filter values using if conditions
      | in for loop
      | and return the result with yield
      |""".stripMargin)

  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  println(sweeteningIngredients)

  // two dim arrays

  val twoDimArray = Array.ofDim[String](2,2)
  twoDimArray(0)(0) = "flour"
  twoDimArray(0)(1) = "sugar"
  twoDimArray(1)(0) = "egg"
  twoDimArray(1)(1) = "syrup"

  // iteration, with nested for

  for {x <- 0 until 2
       y <- 0 until 2
       } println(s"Donut ingredient at ($x,$y) is ${twoDimArray(x)(y)}")
}


