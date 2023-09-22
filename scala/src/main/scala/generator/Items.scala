package generator
import entity.{Item, Product}

import java.time.LocalDate
import scala.collection.mutable.ListBuffer
import scala.util.Random


object Items {
  var mockItems = new ListBuffer[Item]()

  def populateItem: Unit = {
    val product1 = new Product("Soap", "Personal Care", 100, 2.50, LocalDate.of(2023, 9, 17))
    mockItems += new Item(product1,6.0,8.0)
    val product2 = new Product("Pencil", "School Supplies", 10, 0.50, LocalDate.of(2023, 8, 17));
    mockItems += new Item(product2, 6.0, 8.0)
    val product3 = new Product("Apple", "Groceries", 150, 1.00, LocalDate.of(2023, 7, 17));
    mockItems += new Item(product3, 6.0, 8.0)
    val product4 = new Product("T-Shirt", "Clothing", 200, 15.00, LocalDate.of(2023, 7, 25));
    mockItems += new Item(product4, 6.0, 8.0)
    val product5 = new Product("Toothpaste", "Oral Hygiene", 75, 3.50, LocalDate.of(2023, 6, 17));
    mockItems += new Item(product5, 6.0, 8.0)
    val product6 = new Product("Screw", "Tools", 5, 0.10, LocalDate.of(2023, 5, 17));
    mockItems += new Item(product6, 12.0, 16.0)
    val product7 = new Product("Headphones", "Electronics", 30, 25.00, LocalDate.of(2023, 4, 17));
    mockItems += new Item(product7, 12.0, 16.0)
    val product8 = new Product("Potato", "Groceries", 200, 1.50, LocalDate.of(2023, 3, 17));
    mockItems += new Item(product8, 12.0, 16.0)
    val product9 = new Product("Notebook", "School Supplies", 300, 5.00, LocalDate.of(2023, 3, 27));
    mockItems += new Item(product9, 12.0, 16.0)
    val product10 = new Product("Shampoo", "Personal Care", 250, 7.00, LocalDate.of(2023, 2, 17));
    mockItems += new Item(product10, 12.0, 16.0)
    val product11 = new Product("Screwdriver", "Tools", 50, 3.00, LocalDate.of(2023, 1, 17));
    mockItems += new Item(product11, 16.0, 20.0)
    val product12 = new Product("Mug", "Household Items", 300, 4.00, LocalDate.of(2022, 12, 17));
    mockItems += new Item(product12, 16.0, 20.0)
    val product13 = new Product("Bread", "Groceries", 200, 2.00, LocalDate.of(2022, 11, 17));
    mockItems += new Item(product13, 16.0, 20.0)
    val product14 = new Product("Mouse", "Electronics", 100, 20.00, LocalDate.of(2022, 10, 17));
    mockItems += new Item(product14, 16.0, 20.0)
    val product15 = new Product("Hairbrush", "Personal Care", 80, 4.50, LocalDate.of(2022, 9, 17));
    mockItems += new Item(product15, 16.0, 20.0)
    val product16 = new Product("Paraffin", "Crafts", 500, 8.00, LocalDate.of(2022, 8, 17));
    mockItems += new Item(product16, 20.0, 24.0)
    val product17 = new Product("Cup", "Household Items", 150, 1.50, LocalDate.of(2022, 7, 17));
    mockItems += new Item(product16, 20.0, 24.0)
    val product18 = new Product("Lipstick", "Makeup", 5, 6.00, LocalDate.of(2022, 6, 17));
    mockItems += new Item(product16, 20.0, 24.0)
    val product19 = new Product("Tea", "Groceries", 50, 3.00, LocalDate.of(2022, 5, 17));
    mockItems += new Item(product16, 20.0, 24.0)
    val product20 = new Product("Flashlight", "Tools", 150, 10.00, LocalDate.of(2022, 4, 17));
    mockItems += new Item(product16, 20.0, 24.0)
  }

  def generateRandomItems:ListBuffer[Item] = {
    populateItem
    val randomList = new ListBuffer[Item]()
    val random = new Random()
    val listSize = random.nextInt(4) + 1
    for(i <- 0 to listSize) {
      val randomIndex = random.nextInt(mockItems.size)
      randomList += mockItems(randomIndex)
    }
    randomList

  }


}
