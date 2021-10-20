package numbers;


import java.util.Arrays;

import static numbers.Main.*;
import static numbers.Properties.*;

class Filter {

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
                System.out.printf("The property [%s] is wrong. \n", property);
                System.out.println("Available PROPS: " + Arrays.toString(arrayProp));
                return false;
            }
        }
    }

    static void showFilteredResultWithOneWord(long number, int count, String property) {
        if (isProperty(property)) {
            while (count > 0) {
                if (whichProperty(number, property)) {
                    showMultiplyResult(number);
                    count--;
                }
                number++;
            }
        }
    }
}

