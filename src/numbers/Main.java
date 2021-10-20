package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    static long num1;
    static int num2;
    static boolean loop = true;
    static String[] arrayProp = {"ODD", "EVEN", "SPY", "PALINDROMIC", "BUZZ", "DUCK", "GAPFUL", "SUNNY", "SQUARE"};
    static List<String> listProp = Arrays.asList(arrayProp);



    static void showSingleResult(long number) {
        System.out.println("Properties of " + number);
        System.out.println("\s buzz: " + Properties.isBuzz(number));
        System.out.println("\s duck: " + Properties.isDuck(number));
        System.out.println("\s spy: " + Properties.isSpy(number));
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
        if (Properties.isSpy(number)) sb.append("spy, ");
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
        if (number < 0 ) {
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






    static class FilterProperties {



        static void getWarning(String s1, String s2) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s] \n", s1, s2);
            System.out.println("There are no numbers with these properties.");
        }

        static void getWarningSingle(String s) {
            System.out.printf("The property [%s] is wrong. \n", s);
            System.out.println("Available properties: " + listProp);
        }

        static void getFilterResultWithTwoWords(long number, long counter, String word1, String word2) {
            if (counter <= 0) {
                System.out.println("The second parameter should be a natural number.");
            } else if (word1.equals("EVEN") && word2.equals("ODD") || word1.equals("ODD") && word2.equals("EVEN")) {
                getWarning(word1, word2);
            } else if (word1.equals("DUCK") && word2.equals("SPY") || word1.equals("SPY") && word2.equals("DUCK")) {
                getWarning(word1, word2);
            } else if (word1.equals("SUNNY") && word2.equals("SQUARE") || word1.equals("SQUARE") && word2.equals("SUNNY")) {
                getWarning(word1, word2);
            } else if (listProp.contains(word1) && listProp.contains(word2)) {
                switch (word1) {
                    case "SPY" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isSpy(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "BUZZ" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isBuzz(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "PALINDROMIC" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isPalindromic(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "GAPFUL" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isGapful(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "DUCK" -> {
                        switch (word2) {
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isDuck(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "SUNNY" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isSunny(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "SQUARE" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number) && Properties.isSquare(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "EVEN" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Properties.isEven(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    case "ODD" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Properties.isSpy(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Properties.isBuzz(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Properties.isPalindromic(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Properties.isGapful(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Properties.isDuck(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Properties.isSunny(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Properties.isSquare(number) && Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Properties.isOdd(number)) {
                                        showMultiplyResult(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + word2);
                        }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + word1);
                }
            } else if (!listProp.contains(word1) && !listProp.contains(word2)) {
                System.out.printf("The properties [%s, %s] are wrong. \n", word1, word2);
                System.out.println("Available properties: " + listProp);
            } else {
                if (!listProp.contains(word1)) {
                    getWarningSingle(word1);
                } else {
                    getWarningSingle(word2);
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException {
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
                        String fPar1 = input[2].toUpperCase();
                        String fPar2 = input[3].toUpperCase();
                        Filter.showFilteredResultWithOneWord(num1, num2, fPar1, fPar2);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + len);
                }
            } catch (NumberFormatException e) {
                System.out.println("Both parameters should be a natural number.");
            }
        }
    }
}