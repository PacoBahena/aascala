package com.allaboutscala.chapter.three

object callbackTutorial14 extends App {

  def printReport(sendEmailCallback: () => Unit) = {
    println("printing report started ..")
    println("printing report finished ")
    sendEmailCallback()
  }

  def sendMail = println("sent email!")

  printReport(()=> println("send emails"))

  // call the function without passing the call back

  printReport(() => {})

  // better using an option with map

  def printReport2(sendEmailCallback: Option[() => Unit] = None) = {
    println("printing report started ..")
    println("printing report finished ")
    sendEmailCallback.map(callback => callback())
  }

  printReport2(Some(() => println("pudrete")))
  printReport2()

}
