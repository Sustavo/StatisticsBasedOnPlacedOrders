package generator
import entity.{Item, Order}

import scala.util.Random
import scala.collection.mutable.ListBuffer

object Data {
  private def calculateGrandTotal(items: ListBuffer[Item]): Double = {
    var grandTotal = 0.0
    for(item <- items) {
      grandTotal += item.getCost
    }
    grandTotal
  }

  def generateOrders: ListBuffer[Order] = {
    val orders = new ListBuffer[Order]()
    for(name <- Names.getNames) {
      val items = Items.generateRandomItems
      val randomNumber = new Random().nextInt(9999) + 1000
      orders += new Order(items, name, name + randomNumber + "@gmail.com", Addresses.getRandomAddress, calculateGrandTotal(items), RandomDate.getRandomPlacedOrderDate)
    }

    orders
  }


}
