package com.allaboutscala.chapter.two

import com.typesafe.scalalogging.LazyLogging

object escapingTutorial3 extends App with LazyLogging {

  println("How to scape a Json String")
  // escapar asi es de weba.
  val donutJson: String = "{\"donut_name\": \"Glazed Donut\",\"taste_level\":\"Very Tasty\", \"price\": 2.50}"

  println(s"$donutJson")

  // better option , triple quotes
  val donutJson2: String = """{"donut_name": "Glazed Donut","taste_level":"Very Tasty", "price": 2.50}"""

  println(s"mas facil no ? \n $donutJson2")

  // bad practice to use long lines, use short.

  val donutJson3: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level": "Very Tasty",
      |"price": 2.50
      |}
      |""".stripMargin
}
