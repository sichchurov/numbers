package numbers;

import static numbers.Main.*;

class Calculation {

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

    static void display(long number) {
        System.out.println("Properties of " + number);
        System.out.println("\s buzz: " + getBuzz(number));
        System.out.println("\s duck: " + getDuck(number));
        System.out.println("\s spy: " + getSpy(number));
        System.out.println("\s palindromic: " + getPalindromic(number));
        System.out.println("\s gapful: " + getGapful(number));
        System.out.println("\s even: " + getEven(number));
        System.out.println("\s odd: " + getOdd(number));
    }

    static void inlineDisplay(long number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" is ");
        if (getSpy(number)) sb.append("spy, ");
        if (getBuzz(number)) sb.append("buzz, ");
        if (getDuck(number)) sb.append("duck, ");
        if (getPalindromic(number)) sb.append("palindromic, ");
        if (getGapful(number)) sb.append("gapful, ");
        if (getEven(number)) sb.append("even.");
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
            Calculation.display(number);
        }
    }

    static void getSequenceNumbersResult(long number, long counter) {
        if (counter <= 0) {
            System.out.println("The second parameter should be a natural number.");
        } else {
            for (long i = 0; i < counter; i++) {
                Calculation.inlineDisplay(number++);
            }
        }
    }

}