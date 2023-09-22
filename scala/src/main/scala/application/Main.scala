package application
import generator.{Addresses, Data, Items, Names, RandomDate}
import entity.Order
import validator.Validator

import java.time.LocalDate
import java.util.Scanner
import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val start = scanner.nextLine()
    val end = scanner.nextLine()
    Validator.incorrectDates(start, end)
    val startDate = LocalDate.parse(start)
    val endDate = LocalDate.parse(end)

    val orders = Data.generateOrders
    println("----------------------------------------")
    println(s"Total orders: ${orders.size}")
    println("----------------------------------------")

    val filteredOrders = CalculateOrders.filterOrdersByDate(orders, startDate, endDate)
    println("Total filtered orders: " + filteredOrders.size)
    println("Orders filtered based on: " + startDate + " and " + endDate)
    println("----------------------------------------")

    val startList = new ListBuffer[Int]()
    val endList = new ListBuffer[Int]()
    var loop = true

    while (loop) {
      println("Would you like to choose the range? (Yes or No)")
      val choose = scanner.nextLine().toLowerCase()
      choose match {
        case "yes" => {
          loop = false
          CalculateOrders.chooseIntervalOrders(filteredOrders,scanner,startList,endList)
        }
        case "no" => {
          loop = false
          CalculateOrders.allIntervalOrders(filteredOrders)
        }
        case _ => println("Incorrect argument")
      }
    }
  }

}