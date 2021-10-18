package numbers;

import static numbers.Main.*;

class FilterProperties {

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
                        case "ODD" -> {
                            while (counter > 0) {
                                if (Calculation.getOdd(number) && Calculation.getEven(number)) {
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
            }
        } else {
            System.out.printf("The property [%s, %s] are wrong. \n", word1, word2);
            System.out.println("Available properties: " + listProp);
        }
    }
}
