package numbers;

class Properties {

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