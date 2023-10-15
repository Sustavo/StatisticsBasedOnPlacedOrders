package generator
import entity.{Item, Order}

import scala.util.Random
import scala.collection.mutable.ListBuffer

object Data {
  private def calculateGrandTotal(items: ListBuffer[Item]): Double = items.to(LazyList).map((item) => item.getCost).sum

  def generateOrders: ListBuffer[Order] = {
    val orders = new ListBuffer[Order]()
    Names.getNames.foreach((name) => {
      val items = Items.generateRandomItems
      orders += new Order(
        items, name, name + new Random().nextInt(9999) + 1000 + "@gmail.com", Addresses.getRandomAddress, calculateGrandTotal(items), RandomDate.getRandomPlacedOrderDate)
    })

    orders
  }


}
