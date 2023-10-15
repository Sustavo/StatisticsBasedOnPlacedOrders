package entity

import java.time.LocalDate
import scala.collection.mutable.ListBuffer

class Order (
              // private var id: Long,
              private var item: ListBuffer[Item],
              private var clientName: String,
              private var contact: String,
              private var shippingAddress: String,
              private var grandTotal: Double,
              private var requestDate: LocalDate,
            ){

  //def getId: Long = id
  def getItem: ListBuffer[Item] = item

  def setItem(newItem: ListBuffer[Item]): Unit = item = newItem

  def getClientName: String = clientName

  def setClientName(newClientName: String): Unit = clientName = newClientName

  def getContact: String = contact

  def setContact(newContact: String): Unit = contact = newContact

  def getShippingAddress: String = shippingAddress

  def setShippingAddress(newShippingAddress: String): Unit = shippingAddress = newShippingAddress

  def getGrandTotal: Double = grandTotal

  def setGrandTotal(newGrandTotal: Double): Unit = grandTotal = newGrandTotal

  def getRequestDate: LocalDate = requestDate

  def setRequestDate(newRequestDate: LocalDate): Unit = requestDate = newRequestDate

  override def toString: String = {
    s"Order Details:\n" +
      s"Client Name: $clientName\n" +
      s"Contact: $contact\n" +
      s"Shipping Address: $shippingAddress\n" +
      s"Grand Total: $grandTotal\n" +
      s"Request Date: $requestDate\n" +
      s"Items:\n${item.mkString("\n")}"
  }




}
