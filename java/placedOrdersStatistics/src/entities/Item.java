package entities;

public class Item {
    private Product product;
    private Double cost;
    private Double shippingFee;
    private Double taxAmount;

    public Item(Product product, Double shippingFee, Double taxAmount) {
        this.product = product;
        this.shippingFee = shippingFee;
        this.taxAmount = taxAmount;
        this.cost = shippingFee + taxAmount + product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", cost=" + cost +
                ", shippingFee=" + shippingFee +
                ", taxAmount=" + taxAmount +
                '}';
    }
}
