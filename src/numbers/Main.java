package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    static long num1;
    static long num2;
    static boolean loop = true;
    static String[] arrayProp = {"ODD", "EVEN", "SPY", "PALINDROMIC", "BUZZ", "DUCK", "GAPFUL", "SUNNY", "SQUARE"};
    static List<String> listProp = Arrays.asList(arrayProp);

    static class Calculation {

        static boolean getEven(long number) {
            return number % 2 == 0;
        }

        static boolean getOdd(long number) {
            return number % 2 != 0;
        }

        static boolean getBuzz(long number) {
            return number % 7 == 0 || number % 10 == 7;
        }

        static boolean getDuck(long number) {
            while (number > 0) {
                if (number % 10 == 0) {
                    return true;
                }
                number /= 10;
            }
            return false;
        }

        static boolean getPalindromic(long number) {
            String str = Long.toString(number);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        static boolean getGapful(long number) {
            String str = Long.toString(number);
            if (number < 100) {
                return false;
            } else {
                long num = Long.parseLong("" + str.charAt(0) + str.charAt(str.length() - 1));
                return number % num == 0;
            }
        }

        static boolean getSpy(long number) {
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

        static boolean getSunny(long number) {
            for (long i = 1; i < number + 1; i++) {
                if (number + 1 == i * i) {
                    return true;
                }
            }
            return false;
        }

        static boolean getSquare(long number) {
            for (long i = 1; i <= number; i++) {
                if (number == i * i) {
                    return true;
                }
            }
            return false;
        }

        static void display(long number) {
            System.out.println("Properties of " + number);
            System.out.println("\s buzz: " + getBuzz(number));
            System.out.println("\s duck: " + getDuck(number));
            System.out.println("\s spy: " + getSpy(number));
            System.out.println("\s palindromic: " + getPalindromic(number));
            System.out.println("\s gapful: " + getGapful(number));
            System.out.println("\s even: " + getEven(number));
            System.out.println("\s odd: " + getOdd(number));
            System.out.println("\s sunny: " + getSunny(number));
            System.out.println("\s square: " + getSquare(number));
        }

        static void inlineDisplay(long number) {
            StringBuilder sb = new StringBuilder();
            sb.append(number).append(" is ");
            if (getSpy(number)) sb.append("spy, ");
            if (getBuzz(number)) sb.append("buzz, ");
            if (getDuck(number)) sb.append("duck, ");
            if (getPalindromic(number)) sb.append("palindromic, ");
            if (getGapful(number)) sb.append("gapful, ");
            if (getSunny(number)) sb.append("sunny, ");
            if (getSquare(number)) sb.append("square, ");
            if (getEven(number)) sb.append("even.");
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
                display(number);
            }
        }

        static void getSequenceNumbersResult(long number, long counter) {
            if (counter <= 0) {
                System.out.println("The second parameter should be a natural number.");
            } else {
                for (long i = 0; i < counter; i++) {
                    inlineDisplay(number++);
                }
            }
        }

    }

    static class FilterProperties {

        static void getFilterResult(long number, long counter, String word1) {
            if (counter <= 0) {
                System.out.println("The seconds parameter should be a natural number.");
            } else if (listProp.contains(word1)) {
                switch (word1) {
                    case "SPY" -> {
                        while (counter > 0) {
                            if (Calculation.getSpy(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "BUZZ" -> {
                        while (counter > 0) {
                            if (Calculation.getBuzz(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "PALINDROMIC" -> {
                        while (counter > 0) {
                            if (Calculation.getPalindromic(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "GAPFUL" -> {
                        while (counter > 0) {
                            if (Calculation.getGapful(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "DUCK" -> {
                        while (counter > 0) {
                            if (Calculation.getDuck(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "SUNNY" -> {
                        while (counter > 0) {
                            if (Calculation.getSunny(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "SQUARE" -> {
                        while (counter > 0) {
                            if (Calculation.getSquare(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "EVEN" -> {
                        while (counter > 0) {
                            if (Calculation.getEven(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "ODD" -> {
                        while (counter > 0) {
                            if (Calculation.getOdd(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + word1);
                }
            } else {
                System.out.printf("The property %s is wrong. \n", word1);
                System.out.println("Available properties: " + listProp);
            }
        }

        static void getWarning(String s1, String s2) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s] \n", s1, s2);
            System.out.println("There are no numbers with these properties.");
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
                                    if (Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getSpy(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getBuzz(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getPalindromic(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getGapful(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getBuzz(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getSunny(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getSquare(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
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
                                    if (Calculation.getSpy(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "BUZZ" -> {
                                while (counter > 0) {
                                    if (Calculation.getBuzz(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "PALINDROMIC" -> {
                                while (counter > 0) {
                                    if (Calculation.getPalindromic(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "GAPFUL" -> {
                                while (counter > 0) {
                                    if (Calculation.getGapful(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number)) {
                                        Calculation.inlineDisplay(number);
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
            } else {
                System.out.printf("The property [%s, %s] are wrong. \n", word1, word2);
                System.out.println("Available properties: " + listProp);
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
                        String fPar1 = input[2].toUpperCase();
                        FilterProperties.getFilterResult(num1, num2, fPar1);
                    }
                    case 4 -> {
                        num1 = Long.parseLong(input[0]);
                        num2 = Long.parseLong(input[1]);
                        String fPar1 = input[2].toUpperCase();
                        String fPar2 = input[3].toUpperCase();
                        FilterProperties.getFilterResultWithTwoWords(num1, num2, fPar1, fPar2);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + len);
                }
            } catch (NumberFormatException e) {
                System.out.println("Both parameters should be a natural number.");
            }
        }
    }
}