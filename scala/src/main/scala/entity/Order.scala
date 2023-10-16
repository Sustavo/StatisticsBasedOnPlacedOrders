package entity

import java.time.{LocalDate, LocalDateTime}
import scala.collection.mutable.ListBuffer

class Order (
              private var id: Long,
              private var item: List[Int],
              private var clientName: String,
              private var contact: String,
              private var shippingAddress: String,
              private var grandTotal: Double,
              private var requestDate: String,
            ){

  def getId: Long = id
  def getItem: List[Int] = item

  def setItem(newItem: List[Int]): Unit = item = newItem

  def getClientName: String = clientName

  def setClientName(newClientName: String): Unit = {
    clientName = newClientName
  }

  def getContact: String = contact

  def setContact(newContact: String): Unit = {
    contact = newContact
  }

  def getShippingAddress: String = shippingAddress

  def setShippingAddress(newShippingAddress: String): Unit = {
    shippingAddress = newShippingAddress
  }

  def getGrandTotal: Double = grandTotal

  def setGrandTotal(newGrandTotal: Double): Unit = {
    grandTotal = newGrandTotal
  }

  def getRequestDate: String = requestDate

  def setRequestDate(newRequestDate: String): Unit = requestDate = newRequestDate

  override def toString: String = {
    s"VALUES ($clientName, $contact, $shippingAddress, $grandTotal, $requestDate) \n"
  }

  def printarOrders: Unit = println(s"('$clientName', '$contact', '$shippingAddress', $grandTotal, '$requestDate'),")


  def printarOrderItem: Unit = for (i <- item) println(s"($id, $i),")




}
