package application;
import entities.Order;
import generator.Data;
import validator.Validator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (Validator.ValidateParameters(args)) return;
        if (Validator.incorrectDates(args)) return;
        LocalDate startDate = LocalDate.parse(args[0]);
        LocalDate endDate = LocalDate.parse(args[1]);

        List<Order> orders = Data.generateOrders();
        System.out.println("----------------------------------------");
        System.out.printf("Total orders: %d%n", orders.size());
        System.out.println("----------------------------------------");

        List<Order> filteredOrders = CalculateOrders.filterOrdersByDate(orders,startDate,endDate);
        System.out.println("Total filtered orders: " + filteredOrders.size());
        System.out.println("Orders filtered based on: " + startDate + " and " + endDate);
        System.out.println("----------------------------------------");

        List<Integer> startList = new ArrayList<>();
        List<Integer> endList = new ArrayList<>();
        System.out.println("Would you like to choose the range? (Yes or Enter)");
        String choose = scanner.nextLine();

        if(choose.toLowerCase().equals("yes")) {
            CalculateOrders.chooseIntervalOrders(filteredOrders,scanner,startList,endList);
        } else {
            CalculateOrders.allIntervalOrders(filteredOrders);
        }



    }
}