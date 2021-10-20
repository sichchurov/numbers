package numbers;

import java.util.Arrays;
import java.util.Scanner;

import static numbers.Main.Properties.*;

public class Main {

    static final Scanner scanner = new Scanner(System.in);
    static long num1;
    static int num2;
    static boolean loop = true;
    static String[] arrayProp = {"ODD", "EVEN", "SPY", "PALINDROMIC", "BUZZ", "DUCK", "GAPFUL", "SUNNY", "SQUARE"};

    static void showSingleResult(long number) {
        System.out.println("Properties of " + number);
        System.out.println("\s buzz: " + Properties.isBuzz(number));
        System.out.println("\s duck: " + Properties.isDuck(number));
        System.out.println("\s spy: " + isSpy(number));
        System.out.println("\s palindromic: " + Properties.isPalindromic(number));
        System.out.println("\s gapful: " + Properties.isGapful(number));
        System.out.println("\s even: " + Properties.isEven(number));
        System.out.println("\s odd: " + Properties.isOdd(number));
        System.out.println("\s sunny: " + Properties.isSunny(number));
        System.out.println("\s square: " + Properties.isSquare(number));
    }

    static void showMultiplyResult(long number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" is ");
        if (isSpy(number)) sb.append("spy, ");
        if (Properties.isBuzz(number)) sb.append("buzz, ");
        if (Properties.isDuck(number)) sb.append("duck, ");
        if (Properties.isPalindromic(number)) sb.append("palindromic, ");
        if (Properties.isGapful(number)) sb.append("gapful, ");
        if (Properties.isSunny(number)) sb.append("sunny, ");
        if (Properties.isSquare(number)) sb.append("square, ");
        if (Properties.isEven(number)) sb.append("even.");
        else sb.append("odd.");
        System.out.println(sb);
    }

    static void getSingleNumberResult(long number) {
        if (number < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else if (number == 0) {
            System.out.println("Goodbye");
            loop = false;
        } else {
            showSingleResult(number);
        }
    }

    static void getSequenceNumbersResult(long number, long counter) {
        if (counter <= 0) {
            System.out.println("The second parameter should be a natural number.");
        } else {
            for (long i = 0; i < counter; i++) {
                showMultiplyResult(number++);
            }
        }
    }

    static class Properties {

        static boolean isEven(long number) {
            return number % 2 == 0;
        }

        static boolean isOdd(long number) {
            return number % 2 != 0;
        }

        static boolean isBuzz(long number) {
            return number % 7 == 0 || number % 10 == 7;
        }

        static boolean isDuck(long number) {
            while (number > 0) {
                if (number % 10 == 0) {
                    return true;
                }
                number /= 10;
            }
            return false;
        }

        static boolean isPalindromic(long number) {
            String str = Long.toString(number);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        static boolean isGapful(long number) {
            String str = Long.toString(number);
            if (number < 100) {
                return false;
            } else {
                long num = Long.parseLong("" + str.charAt(0) + str.charAt(str.length() - 1));
                return number % num == 0;
            }
        }

        static boolean isSpy(long number) {
            long sum = 0;
            long multi = 1;
            while (number > 0) {
                long remainder = number % 10;
                sum += remainder;
                multi *= remainder;
                number /= 10;
            }
            return sum == multi;
        }

        static boolean isSunny(long number) {
            return Math.sqrt((double) number + 1) % 1 == 0;
        }

        static boolean isSquare(long number) {
            return Math.sqrt(number) % 1 == 0;
        }
    }

    static class Filter {

        static boolean isProperty(String property) {
            String[] properties = {"ODD", "EVEN", "SPY", "PALINDROMIC", "BUZZ", "DUCK", "GAPFUL", "SUNNY", "SQUARE"};
            for (String s : properties) {
                if (s.equals(property)) {
                    return true;
                }
            }
            return false;
        }

        static boolean whichProperty(long number, String property) {
            switch (property) {
                case "SPY" -> {
                    return isSpy(number);
                }
                case "BUZZ" -> {
                    return isBuzz(number);
                }
                case "PALINDROMIC" -> {
                    return isPalindromic(number);
                }
                case "GAPFUL" -> {
                    return isGapful(number);
                }
                case "SUNNY" -> {
                    return isSunny(number);
                }
                case "SQUARE" -> {
                    return isSquare(number);
                }
                case "EVEN" -> {
                    return isEven(number);
                }
                case "ODD" -> {
                    return isOdd(number);
                }
                default -> {
                    return false;
                }
            }
        }

        static void showWarningOneProperty(String property) {
            System.out.printf("The property [%s] is wrong. \n", property);
            System.out.println("Available properties: " + Arrays.toString(arrayProp));
        }

        static void showWarningMoreProperties(String property, String propertyTwo) {
            System.out.printf("The properties [%s, %s] are wrong. \n", property, propertyTwo);
            System.out.println("Available properties: " + Arrays.toString(arrayProp));
        }

        static void showExclusivesWarnings(String property, String propertyTwo) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s] \n", property, propertyTwo);
            System.out.println("There are no numbers with these properties.");
        }

        static void showFilteredResultWithOneWord(long number, int count, String property) {
            if (count <= 0) {
                System.out.println("The second parameter should be a natural number.");
            } else if (isProperty(property)) {
                while (count > 0) {
                    if (whichProperty(number, property)) {
                        showMultiplyResult(number);
                        count--;
                    }
                    number++;
                }
            } else {
                showWarningOneProperty(property);
            }
        }

        static boolean isExclusive(String property, String propertyTwo) {
            if (property.equals("EVEN") && propertyTwo.equals("ODD") || property.equals("ODD") && propertyTwo.equals("EVEN")) {
                return false;
            } else if (property.equals("DUCK") && propertyTwo.equals("SPY") || property.equals("SPY") && propertyTwo.equals("DUCK")) {
                return false;
            } else {
                return !property.equals("SUNNY") && !propertyTwo.equals("SQUARE") || !property.equals("SQUARE") && !propertyTwo.equals("SUNNY");
            }
        }

        static void showFilteredResultMoreOneWord(long number, int count, String property, String propertyTwo) {
            if (count <= 0) {
                System.out.println("The second parameter should be a natural number.");
            } else if (!isExclusive(property, propertyTwo)) {
                showExclusivesWarnings(property, propertyTwo);
            } else if (isProperty(property)) {
                while (count > 0) {
                    if (whichProperty(number, property) && whichProperty(number, propertyTwo)) {
                        showMultiplyResult(number);
                        count--;
                    }
                    number++;
                }
            } else {
                showWarningMoreProperties(property, propertyTwo);
            }
        }

    }

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
                        getSingleNumberResult(num1);
                    }
                    case 2 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Integer.parseInt(input[1]);
                        getSequenceNumbersResult(num1, num2);
                    }
                    case 3 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Integer.parseInt(input[1]);
                        String fPar1 = input[2].toUpperCase();
                        Filter.showFilteredResultWithOneWord(num1, num2, fPar1);
                    }
                    case 4 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Integer.parseInt(input[1]);
                        String property = input[2].toUpperCase();
                        String propertyTwo = input[3].toUpperCase();
                        Filter.showFilteredResultMoreOneWord(num1, num2, property, propertyTwo);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + len);
                }
            } catch (NumberFormatException e) {
                System.out.println("Both parameters should be a natural number.");
            }
        }
    }
}