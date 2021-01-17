package com.allaboutscala.chapter.two

object whileTutorial8 {

  def main(args: Array[String]): Unit = {

    var doneDonuts = 0

    while( doneDonuts < 10) {

      println(s" donuts baked: $doneDonuts")
      doneDonuts += 1
    }

    var deliveredDonuts = 0

    do {
      deliveredDonuts +=1
      println(s"delivered donuts $deliveredDonuts")
    }
    while (deliveredDonuts < 10)

  }
}
