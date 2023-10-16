package application
import generator.Data

object Main {
  def main(args: Array[String]): Unit = {
    val orders = Data.generateOrders
    println("----------------------------------------")
    for(order <- orders) {
      order.printarOrders
    }

    for (order <- orders) {
      order.printarOrderItem
    }


    println("----------------------------------------")



  }

}