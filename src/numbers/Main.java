package numbers;

import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static long num1;
    static long num2;
    static boolean loop = true;

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests: ");
        System.out.println("\s - enter a natural number to know its properties;");
        System.out.println("\s - enter two natural numbers to obtain the properties of the list:");
        System.out.println("\t * the first parameter represents a starting number;");
        System.out.println("\t * the second parameter shows how many consecutive numbers are to be printed;");
        System.out.println("\s - two natural numbers and a property to search for;");
        System.out.println("\s - two natural numbers and two properties to search for;");
        System.out.println("\s - separate the parameters with one space;");
        System.out.println("\s - enter 0 to exit");
        while (loop) {
            System.out.println("Enter a request:");
            String[] input = scanner.nextLine().split(" ");
            int len = input.length;

            try { // if a user inputs not a natural num as a parameter
                switch (len) {
                    case 1 -> {
                        num1 = Long.parseLong(input[0]);
                        Calculation.getSingleNumberResult(num1);
                    }
                    case 2 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Long.parseLong(input[1]);
                        Calculation.getSequenceNumbersResult(num1, num2);
                    }
                    case 3 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Long.parseLong(input[1]);
                        String inputFilterParameter1 = input[2].toUpperCase();
                        FilterProperties.getFilterResult(FilterWords.valueOf(inputFilterParameter1));
                    }
                    case 4 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Long.parseLong(input[1]);
                        String inputFilterParameter1 = input[2].toUpperCase();
                        String inputFilterParameter2 = input[3].toUpperCase();
                        FilterProperties.getSeveralFilterResult(inputFilterParameter1, inputFilterParameter2);
                        System.out.println(FilterWords.valueOf(inputFilterParameter2));

                    }
                    default -> throw new IllegalStateException("Unexpected value: " + len);
                }
            } catch (NumberFormatException e) {
                System.out.println("Both parameter should be a natural number.");
            }
        }
    }
}