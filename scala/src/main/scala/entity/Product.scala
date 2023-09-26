package entity

import java.time.LocalDate

class Product(
               //private var id: Long,
             private var name: String,
             private var category: String,
             private var weight: Double,
             private var price: Double,
             private var creationDate: LocalDate
              ){

  //def getId: Long = id

  def getName: String = name

  def setName(newName: String): Unit = {
    name = newName
  }

  def getCategory: String = category

  def setCategory(newCategory: String): Unit = {
    category = newCategory
  }

  def getWeight: Double = weight

  def setWeight(newWeight: Double): Unit = {
    weight = newWeight
  }

  def getPrice: Double = price

  def setPrice(newPrice: Double): Unit = {
    price = newPrice
  }

  def getCreationDate: LocalDate = creationDate

  def setCreationDate(newCreationDate: LocalDate): Unit = {
    creationDate = newCreationDate
  }

  override def toString: String = {
    s"Nome: $name, Categoria: $category, Peso: $weight, Preço: $price, Data de criação: $creationDate"
  }


}
