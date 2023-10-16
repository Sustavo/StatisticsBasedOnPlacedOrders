package generator
import entity.{Item, Order}
import generator.Items.mockItems

import scala.util.Random
import scala.collection.mutable.ListBuffer

object Data {
  private def calculateGrandTotal(numbers: List[Int], sum: Double): Double = {
    if(numbers.isEmpty) {
      sum
    } else {
      val maxIndex = if (mockItems.isEmpty) 0 else mockItems.size - 1
      val randomIndex = if (maxIndex > 0) new Random().nextInt(maxIndex) else 0
      val item = mockItems(randomIndex)
      calculateGrandTotal(numbers.tail, item.getCost + sum)
    }
  }

  def generateOrders: ListBuffer[Order] = {
    val orders = new ListBuffer[Order]()
    var id = 1
    Names.getNames.foreach((name) => {
      val items = Items.generateRandomItems
      orders += new Order(
        id, items, name, name + (new Random().nextInt(9999) + 1000) + "@gmail.com", Addresses.getRandomAddress, calculateGrandTotal(items, 0), RandomDate.getRandomPlacedOrderTime)
        id += 1
    })
    orders
  }


}
