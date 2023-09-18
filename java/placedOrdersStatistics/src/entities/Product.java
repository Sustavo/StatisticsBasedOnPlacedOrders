package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Product {
    private String name;
    private String category;
    private double weight;
    private double price;
    private LocalDate creationDate;

    public Product(String name, String category, double weight, double price, LocalDate creationDate) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameProduct) {
        this.name = nameProduct;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", creationDate=" + creationDate +
                '}';
    }
}
