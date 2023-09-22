package application
import entity.Order
import validator.Validator

import java.time.{LocalDate, LocalDateTime}
import java.util.{Optional, Scanner}
import scala.collection.mutable.ListBuffer

object CalculateOrders {
  def filterOrdersByDate(orders: ListBuffer[Order], startDate: LocalDate, endDate: LocalDate): ListBuffer[Order] = {
    orders
      .filter(order => order.getRequestDate.isAfter(startDate))
      .filter(order => order.getRequestDate.isBefore(endDate))
  }

  def calculateIntervalOrders(orders: ListBuffer[Order], start: Int, end: Int): Unit = {
    val result = orders
      .filter((order: Order) => order.getItem
      .exists((item) => item.getProduct.getCreationDate.isBefore(LocalDate.now.minusMonths(start)) &&
      item.getProduct.getCreationDate.isAfter(LocalDate.now.minusMonths(end)))).length

    println(s"${start}-${end} months: ${result}")
  }

  def chooseIntervalOrders(orders: ListBuffer[Order], scanner: Scanner, startList: ListBuffer[Int], endList: ListBuffer[Int]): Unit  = {
    println("Choose your interval (start-end): ")
    val interval = scanner.nextLine().split("-")
    val startInterval = Integer.parseInt(interval(0))
    val endInterval = Integer.parseInt(interval(1))
    Validator.EndIsBiggerThanStart(startInterval, endInterval)
    startList += startInterval
    endList += endInterval
    var loop = true

    while(loop){
      println("Do you want to stop? (Yes or No)")
      val stop = scanner.nextLine().toLowerCase()
      stop match {
        case "yes" => {
          loop = false
          println("Result: ")
          for (i <- 0 until startList.size) {
            CalculateOrders.calculateIntervalOrders(orders, startList(i), endList(i))
          }
        }
        case "no" => {
          loop = false
          chooseIntervalOrders(orders, scanner, startList, endList)
        }
        case _ => println("Invalid Argument")
      }
    }

  }

  def allIntervalOrders(orders: ListBuffer[Order]): Unit = {
    println("Result: ")
    calculateIntervalOrders(orders,1,3)
    calculateIntervalOrders(orders,4,6)
    calculateIntervalOrders(orders, 7, 12);
    calculateIntervalOrders(orders, 12, 48);
  }





}
