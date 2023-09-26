package entity

class Item (
           //private var id: Long,
           private var product: Product,
           private var shippingFee: Double,
           private var taxAmount: Double
           ){
  private val cost: Double = shippingFee + taxAmount + product.getPrice

  //def getId: Long = id

  def getProduct: Product = product

  def setProduct(newProduct: Product): Unit = {
    product = newProduct
  }

  def getShippingFee: Double = shippingFee

  def setShippingFee(newShippingFee: Double): Unit = {
    shippingFee = newShippingFee
  }

  def getTaxAmount: Double = taxAmount

  def setTaxAmount(newTaxAmount: Double): Unit = {
    taxAmount = newTaxAmount
  }

  def getCost: Double = cost


  override def toString: String = {
    s"Produto: ${product.toString}, Custo: $cost, Taxa de Envio: $shippingFee, Valor do Imposto: $taxAmount"
  }

}
