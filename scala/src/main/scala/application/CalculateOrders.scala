package application
import entity.Order
import validator.Validator

import java.time.LocalDate
import java.util.Scanner
import scala.collection.mutable.ListBuffer

object CalculateOrders {

  def filterOrdersByDate(orders: ListBuffer[Order], startDate: LocalDate, endDate: LocalDate): ListBuffer[Order] = {
    orders.filter(order => order.getRequestDate.isAfter(startDate) && order.getRequestDate.isBefore(endDate))
  }

  private def calculateIntervalOrders(orders: ListBuffer[Order], start: Int, end: Int): Unit = {
    val result = orders.to(LazyList).count((order: Order) => order.getRequestDate.isBefore(LocalDate.now.minusMonths(start)) &&
      order.getRequestDate.isAfter(LocalDate.now.minusMonths(end)))

    println(s"${start}-${end} months: ${result}")
  }

  private def calculateIntervalOrdersByComparative(orders: ListBuffer[Order], comparator: String, month: Int): Unit = {
    var result: Int = 0
    if (comparator == ">") {
      result = orders.to(LazyList).count((order: Order) => order.getRequestDate.isBefore(LocalDate.now.minusMonths(month)) &&
        order.getRequestDate.isAfter(LocalDate.now.minusMonths(999)))
    } else if (comparator == "<") {
      result = orders.to(LazyList).count((order: Order) => order.getRequestDate.isBefore(LocalDate.now.minusMonths(0)) &&
        order.getRequestDate.isAfter(LocalDate.now.minusMonths(month)))
    }

    println(s"${comparator}${month} months: ${result}")
  }

  def chooseIntervalOrders(orders: ListBuffer[Order], scanner: Scanner, startList: ListBuffer[Any], endList: ListBuffer[Any]): Unit  = {
    println("Choose your interval (ex: 1-6 or >15): ")
    val input = scanner.nextLine()

    val interval = if (input.contains("-")) {
      val parts = input.split("-")
      if (parts.length == 2) {
        val start = Integer.parseInt(parts(0).trim())
        val end = Integer.parseInt(parts(1).trim())
        Validator.EndIsBiggerThanStart(start, end)
        List(start, end)
      } else {
        List.empty[Int]
      }
    } else if (input.startsWith(">") || input.startsWith("<")) {
      val operator = input.substring(0, 1)
      val value = Integer.parseInt(input.substring(1).trim())
      List(operator, value)
    } else {
      List.empty[Int]
    }

    startList += interval(0)
    endList += interval(1)
    var loop = true

    while(loop){
      println("Do you want to stop? (Yes or No)")
      val stop = scanner.nextLine().toLowerCase()
      stop match {
        case "yes" => {
          loop = false
          println("Result: ")
          for (i <- startList.indices) {
            if((startList(i) == ">" || startList(i) == "<") && startList(i).isInstanceOf[String] && endList(i).isInstanceOf[Int]) {
              val operator = startList(i).toString()
              val month = endList(i).asInstanceOf[Int]
              calculateIntervalOrdersByComparative(orders, operator, month)
            } else {
              val start = startList(i).asInstanceOf[Int]
              val end = endList(i).asInstanceOf[Int]
              CalculateOrders.calculateIntervalOrders(orders, start, end)
            }
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

  def defaultIntervalOrders(orders: ListBuffer[Order]): Unit = {
    println("Result: ")
    calculateIntervalOrders(orders,1,3)
    calculateIntervalOrders(orders,4,6)
    calculateIntervalOrders(orders, 7, 12);
    calculateIntervalOrdersByComparative(orders,">",12)
  }





}
