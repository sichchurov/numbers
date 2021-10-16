package numbers;

import static numbers.Main.*;

class FilterProperties {

    static long number;
    static long counter;

    static void getFilterResult(String word1) {
        if (num2 <= 0) {
            System.out.println("The second parameter should be a natural number.");
        } else {
            if (listProp.contains(word1)) {
                switch (word1) {
                    case "SPY" -> findSpyNumber(num1, num2);
                    case "BUZZ" -> findBuzzNumber(num1, num2);
                    case "PALINDROMIC" -> {
                        while (counter > 0) {
                            if (Calculation.getPalindromic(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "GAPFUL" -> findGapfulNumber(num1, num2);
                    case "DUCK" -> findDuckNumber(num1, num2);
                    case "SUNNY" -> {
                        while (counter > 0) {
                            if (Calculation.getSunny(number)) {
                                Calculation.inlineDisplay(number);
                                counter--;
                            }
                            number++;
                        }
                    }
                    case "SQUARE" -> findSquareNumber(num1, num2);
                    case "EVEN" -> findEvenNumber(num1, num2);
                    case "ODD" -> findOddNumber(num1, num2);
                    default -> {
                        System.out.println("The property " + word1 + " is wrong");
                        System.out.println("Available properties: " + listProp);
                    }
                }
            }
        }
    }

    static void getFilterResult(long number, long counter,String word1, String word2) {
        if (num2 <= 0) {
            System.out.println("The second parameter should be a natural number.");
        } else {
            if (listProp.contains(word1)) {
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
                                    if (Calculation.getGapful(number) && Calculation.getSpy(number))  {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
                            case "DUCK" -> {
                                while (counter > 0) {
                                    if (Calculation.getDuck(number) && Calculation.getSpy(number)) {
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
                                    if (Calculation.getGapful(number) && Calculation.getBuzz(number))  {
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
                                    if (Calculation.getGapful(number) && Calculation.getPalindromic(number))  {
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
                            default -> {
                                System.out.println("The property " + word1 + " is wrong");
                                System.out.println("Available properties: " + listProp);
                            }
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
                                    if (Calculation.getGapful(number))  {
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
                            default -> {
                                System.out.println("The property " + word1 + " is wrong");
                                System.out.println("Available properties: " + listProp);
                            }
                        }
                    }
                    case "DUCK" -> {
                        switch (word2) {
                            case "SPY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSpy(number) && Calculation.getDuck(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
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
                                    if (Calculation.getGapful(number) && Calculation.getDuck(number))  {
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
                            case "SQUARE" -> {
                                while (counter > 0) {
                                    if (Calculation.getSquare(number) && Calculation.getSunny(number)) {
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
                                    if (Calculation.getGapful(number) && Calculation.getSquare(number))  {
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
                            case "SUNNY" -> {
                                while (counter > 0) {
                                    if (Calculation.getSunny(number) && Calculation.getSquare(number)) {
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
                                    if (Calculation.getGapful(number) && Calculation.getEven(number))  {
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
                            case "ODD" -> {
                                while (counter > 0) {
                                    if (Calculation.getOdd(number) && Calculation.getEven(number)) {
                                        Calculation.inlineDisplay(number);
                                        counter--;
                                    }
                                    number++;
                                }
                            }
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
                                    if (Calculation.getGapful(number) && Calculation.getOdd(number))  {
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
                            case "EVEN" -> {
                                while (counter > 0) {
                                    if (Calculation.getEven(number) && Calculation.getOdd(number)) {
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
                    default -> {
                        System.out.println("The property " + word1 + " is wrong");
                        System.out.println("Available properties: " + listProp);
                    }
                }
            } else {
                System.out.println("FUCK");
            }

        }
    }

    static void findOddNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getOdd(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }

    static void findEvenNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getEven(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }

    static void findDuckNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getDuck(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }

    static void findGapfulNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getGapful(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }



    static void findSpyNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getSpy(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }

    static void findBuzzNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getBuzz(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }



    static void findSquareNumber(long number, long counter) {
        while (counter > 0) {
            if (Calculation.getSquare(number)) {
                Calculation.inlineDisplay(number);
                counter--;
            }
            number++;
        }
    }
}
