package application;

import entities.Order;
import validator.Validator;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CalculateOrders {

    public static List<Order> filterOrdersByDate(List<Order> orders, LocalDate startDate, LocalDate endDate) {
        return Optional.ofNullable(orders)
                .orElseGet(Collections::emptyList).stream()
                .filter(order -> order.getRequestDate().isAfter(startDate))
                .filter(order -> order.getRequestDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    public static void calculateIntervalOrders(List<Order> orders, int start, int end) {
        Long result = orders.stream()
                .filter(order -> Optional.ofNullable(order.getItems()).orElseGet(Collections::emptyList)
                        .stream()
                        .anyMatch(item ->
                                item.getProduct().getCreationDate().isBefore(LocalDate.now().minusMonths(start)) &&
                                        item.getProduct().getCreationDate().isAfter(LocalDate.now().minusMonths(end))
                        )
                ).count();

        System.out.println(start + " - " + end + " months: " + result);
    }

    public static void chooseIntervalOrders(List<Order> orders, Scanner scanner, List<Integer> startList, List<Integer> endList) {
        System.out.println("Choose your interval (start-end): ");
        String[] interval = scanner.nextLine().split("-");
        int startInverval = Integer.parseInt(interval[0]);
        int endInterval = Integer.parseInt(interval[1]);

        Validator.EndIsBiggerThanStart(startInverval,endInterval);

        startList.add(startInverval);
        endList.add(endInterval);

        System.out.println("Do you want to stop? (Yes or Enter)");
        String stop = scanner.nextLine();
        if(stop.toLowerCase().equals("yes")) {
            System.out.println("Result: ");
            for (int i = 0; i < startList.size(); i++) {
                CalculateOrders.calculateIntervalOrders(orders,startList.get(i),endList.get(i));
            }
        } else {
            chooseIntervalOrders(orders,scanner,startList,endList);
        }
    }

    public static void allIntervalOrders(List<Order> orders) {
        System.out.println("Result: ");
        CalculateOrders.calculateIntervalOrders(orders,1,3);
        CalculateOrders.calculateIntervalOrders(orders,4,6);
        CalculateOrders.calculateIntervalOrders(orders,7,12);
        CalculateOrders.calculateIntervalOrders(orders,12,999);
    }
}
