package numbers;

import java.util.Arrays;

import static numbers.Main.num1;
import static numbers.Main.num2;

class FilterProperties {

    static void getFilterResult(FilterWords filterWords) {
        if (num2 <= 0) {
            System.out.println("The second parameter should be a natural number.");
        } else {

            switch (filterWords) {
                case ODD -> findOddNumber(num1, num2);
                case EVEN -> findEvenNumber(num1, num2);
                case DUCK -> findDuckNumber(num1, num2);
                case BUZZ -> findBuzzNumber(num1, num2);
                case SPY -> findSpyNumber(num1, num2);
                case GAPFUL -> findGapfulNumber(num1, num2);
                case PALINDROMIC -> findPalindromicNumber(num1, num2);
                case SUNNY -> findSunnyNumber(num1, num2);
                case SQUARE -> findSquareNumber(num1, num2);
                default -> {
                    System.out.println("The property " + filterWords + " is wrong");
                    System.out.println("Available properties: " + Arrays.toString(FilterWords.values()));
                }
            }
        }
    }

    static void getSeveralFilterResult(String filterWord1, String filterWord2) {
        if (FilterWords.valueOf(filterWord1).equals(FilterWords.valueOf(filterWord2))) {
            getFilterResult(FilterWords.valueOf(filterWord1));
        } else {
            System.out.printf("The request contains mutually exclusive properties %s, %s: ", filterWord1, filterWord2);
            System.out.println("There are no numbers with these properties.");
        }
    }

    static void findOddNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getOdd(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findEvenNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getEven(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findDuckNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getDuck(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findGapfulNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getGapful(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findPalindromicNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getPalindromic(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findSpyNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getSpy(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findBuzzNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getBuzz(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findSunnyNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getSunny(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }

    static void findSquareNumber(long number, long counter) {
        long i;
        for (i = 0; i < counter; ) {
            if (Calculation.getSquare(number)) {
                Calculation.inlineDisplay(number);
                i++;
            }
            number++;
        }
    }
}
