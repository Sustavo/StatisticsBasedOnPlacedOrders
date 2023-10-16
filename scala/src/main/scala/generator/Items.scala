package generator
import entity.{Item, Product}

import java.time.LocalDate
import scala.collection.mutable.ListBuffer
import scala.util.Random


object Items {
  var mockItems = new ListBuffer[Item]()

  def populateItem(): Unit = {
    val product1 = new Product(1 ,"Soap", "Personal Care", 100, 2.50, LocalDate.of(2023, 9, 17))
    mockItems += new Item(1 ,product1,6.0,8.0)
    val product2 = new Product(2 ,"Pencil", "School Supplies", 10, 0.50, LocalDate.of(2023, 8, 17));
    mockItems += new Item(2 ,product2, 6.0, 8.0)
    val product3 = new Product(3 ,"Apple", "Groceries", 150, 1.00, LocalDate.of(2023, 7, 17));
    mockItems += new Item(3 ,product3, 6.0, 8.0)
    val product4 = new Product(4 ,"T-Shirt", "Clothing", 200, 15.00, LocalDate.of(2023, 7, 25));
    mockItems += new Item(4 ,product4, 6.0, 8.0)
    val product5 = new Product(5 ,"Toothpaste", "Oral Hygiene", 75, 3.50, LocalDate.of(2023, 6, 17));
    mockItems += new Item(5 ,product5, 6.0, 8.0)
    val product6 = new Product(6 ,"Screw", "Tools", 5, 0.10, LocalDate.of(2023, 5, 17));
    mockItems += new Item(6 ,product6, 12.0, 16.0)
    val product7 = new Product(7 ,"Headphones", "Electronics", 30, 25.00, LocalDate.of(2023, 4, 17));
    mockItems += new Item(7 ,product7, 12.0, 16.0)
    val product8 = new Product(8 ,"Potato", "Groceries", 200, 1.50, LocalDate.of(2023, 3, 17));
    mockItems += new Item(8 ,product8, 12.0, 16.0)
    val product9 = new Product(9 ,"Notebook", "School Supplies", 300, 5.00, LocalDate.of(2023, 3, 27));
    mockItems += new Item(9 ,product9, 12.0, 16.0)
    val product10 = new Product(10 ,"Shampoo", "Personal Care", 250, 7.00, LocalDate.of(2023, 2, 17));
    mockItems += new Item(10 ,product10, 12.0, 16.0)
    val product11 = new Product(11 ,"Screwdriver", "Tools", 50, 3.00, LocalDate.of(2023, 1, 17));
    mockItems += new Item(11 ,product11, 16.0, 20.0)
    val product12 = new Product(12 ,"Mug", "Household Items", 300, 4.00, LocalDate.of(2022, 12, 17));
    mockItems += new Item(12 ,product12, 16.0, 20.0)
    val product13 = new Product(13 ,"Bread", "Groceries", 200, 2.00, LocalDate.of(2022, 11, 17));
    mockItems += new Item(13 ,product13, 16.0, 20.0)
    val product14 = new Product(14 ,"Mouse", "Electronics", 100, 20.00, LocalDate.of(2022, 10, 17));
    mockItems += new Item(14 ,product14, 16.0, 20.0)
    val product15 = new Product(15 ,"Hairbrush", "Personal Care", 80, 4.50, LocalDate.of(2022, 9, 17));
    mockItems += new Item(15 ,product15, 16.0, 20.0)
    val product16 = new Product(16 ,"Paraffin", "Crafts", 500, 8.00, LocalDate.of(2022, 8, 17));
    mockItems += new Item(16 ,product16, 20.0, 24.0)
    val product17 = new Product(17 ,"Cup", "Household Items", 150, 1.50, LocalDate.of(2022, 7, 17));
    mockItems += new Item(17 ,product17, 20.0, 24.0)
    val product18 = new Product(18 ,"Lipstick", "Makeup", 5, 6.00, LocalDate.of(2022, 6, 17));
    mockItems += new Item(18 ,product18, 20.0, 24.0)
    val product19 = new Product(19 ,"Tea", "Groceries", 50, 3.00, LocalDate.of(2022, 5, 17));
    mockItems += new Item(19 ,product19, 20.0, 24.0)
    val product20 = new Product(20 ,"Flashlight", "Tools", 150, 10.00, LocalDate.of(2022, 4, 17));
    mockItems += new Item(20 ,product20, 20.0, 24.0)
  }

  populateItem()

  def generateRandomItems: List[Int] = {
    val randomList = new ListBuffer[Int]()
    for (i <- 0 to new Random().nextInt(4) + 1) {
      randomList += new Random().nextInt(mockItems.size) + (1)
    }
    randomList.toList
  }

}
