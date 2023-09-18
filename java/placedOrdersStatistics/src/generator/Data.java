package generator;

import entities.Item;
import entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {
    public static double calculateGrandTotal(List<Item> items) {
        double grandTotal = 0.0;
        for (Item item: items) {
            grandTotal += item.getCost();
        }
        return grandTotal;
    }

    public static List<Order> generateOrders() {
        List<Order> orders = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < Names.getNames().size(); i++) {
            List<Item> items = Items.generateRandomItems();
            int randomNumber = random.nextInt(9999) + 1000;
            String name = Names.getNames().get(i);
            orders.add(new Order(items, name, name + randomNumber + "@gmail.com",
                    Addresses.randomAddress(), calculateGrandTotal(items),
                    RandomDate.getRandomPlacedOrderDate() ));
        }

        return orders;
    }
}
