package entities;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private String clientName;
    private String contact;
    private String shippingAdress;
    private Double grandTotal;
    private LocalDate requestDate;

    public Order(List<Item> items, String clientName, String contact, String shippingAdress, Double grandTotal, LocalDate requestDateHour) {
        this.items = items;
        this.clientName = clientName;
        this.contact = contact;
        this.shippingAdress = shippingAdress;
        this.grandTotal = grandTotal;
        this.requestDate = requestDateHour;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDateHour) {
        this.requestDate = requestDateHour;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", clientName='" + clientName + '\'' +
                ", contact='" + contact + '\'' +
                ", shippingAdress='" + shippingAdress + '\'' +
                ", grandTotal=" + grandTotal +
                ", requestDateHour=" + requestDate +
                "items=" + items +
                '}';
    }
}
