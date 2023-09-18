package validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validator {
    public static boolean ValidateParameters(String[] args) {
        if(args.length != 2) {
            System.out.println("you need to enter two dates:\n" +
                    "Start Date and End Date");
            return true;
        }
        return false;
    }

    public static boolean incorrectDates(String[] args) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(args[0], formatter);
            LocalDate.parse(args[1], formatter);
            return false;
        } catch (Exception e) {
            System.out.println("An error occurred when trying to use the arguments passed.\nit is necessary to pass using the format: \"YYYY-MM-DD\"");
        }
        return true;
    }

    public static boolean EndIsBiggerThanStart(int start, int end) {
        if (end > start) {
            return true;
        } else {
            throw new IllegalArgumentException("The value of 'end' must be greater than 'start'.");
        }
    }




}
