package application
import generator.Data
import validator.Validator

import java.time.LocalDate
import java.util.Scanner
import scala.collection.mutable.ListBuffer


object Main {
  def main(args: Array[String]): Unit = {

    val scanner = new Scanner(System.in)
    if(Validator.validateParameters(args)) return
    if(Validator.incorrectDates(args)) return

    val startDate = LocalDate.parse(args(0));
    val endDate = LocalDate.parse(args(1));

    val orders = Data.generateOrders
    println("----------------------------------------")
    println(s"Total orders: ${orders.size}")
    println("----------------------------------------")

    val filteredOrders = CalculateOrders.filterOrdersByDate(orders, startDate, endDate)
    println("Total filtered orders: " + filteredOrders.size)
    println("Orders filtered based on: " + startDate + " and " + endDate)
    println("----------------------------------------")

    val startList = new ListBuffer[Any]()
    val endList = new ListBuffer[Any]()
    var loop = true

    while (loop) {
      println("Would you like to choose the range? (Yes or No)")
      val choose = scanner.nextLine().toLowerCase()
      choose match {
        case "yes" =>
          loop = false
          CalculateOrders.chooseIntervalOrders(filteredOrders,scanner,startList,endList)
        case "no" =>
          loop = false
          CalculateOrders.defaultIntervalOrders(filteredOrders)
        case _ => println("Incorrect argument")

      }
    }

  }

}