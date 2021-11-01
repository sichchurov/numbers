package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static numbers.Main.Display.*;
import static numbers.Main.Properties.*;
import static numbers.Main.Warnings.*;

public class Main {

	static final Scanner scanner = new Scanner(System.in);
	static long number;
	static int counter;
	static boolean loop = true;
	static String[] propertiesArray = {"ODD", "EVEN", "SPY", "PALINDROMIC", "BUZZ", "DUCK", "GAPFUL", "SUNNY",
			"SQUARE", "JUMPING", "SAD", "HAPPY"};
	static String[] propertiesArrayMinus = {"-ODD", "-EVEN", "-SPY", "-PALINDROMIC", "-BUZZ", "-DUCK", "-GAPFUL",
			"-SUNNY", "-SQUARE", "-JUMPING", "-SAD", "-HAPPY"};


	static String[] input;

	static class Display {

		static void getSingleResult(long number) {
			System.out.println("Properties of " + number);
			System.out.println("buzz: " + Properties.isBuzz(number));
			System.out.println("duck: " + Properties.isDuck(number));
			System.out.println("spy: " + isSpy(number));
			System.out.println("palindromic: " + isPalindromic(number));
			System.out.println("gapful: " + isGapful(number));
			System.out.println("even: " + isEven(number));
			System.out.println("odd: " + isOdd(number));
			System.out.println("sunny: " + isSunny(number));
			System.out.println("square: " + isSquare(number));
			System.out.println("jumping: " + isJumping(number));
			System.out.println("sad: " + !isHappy(number));
			System.out.println("happy: " + isHappy(number));
		}

		static void getMultiplyResult(long number) {
			StringBuilder sb = new StringBuilder();
			sb.append(number).append(" is ");
			if (isSpy(number))
				sb.append("spy, ");
			if (isBuzz(number))
				sb.append("buzz, ");
			if (isDuck(number))
				sb.append("duck, ");
			if (isPalindromic(number))
				sb.append("palindromic, ");
			if (isGapful(number))
				sb.append("gapful, ");
			if (isSunny(number))
				sb.append("sunny, ");
			if (isSquare(number))
				sb.append("square, ");
			if (isJumping(number))
				sb.append("jumping, ");
			if (!isHappy(number))
				sb.append("sad, ");
			if (isHappy(number))
				sb.append("happy, ");
			if (isEven(number))
				sb.append("even.");
			else
				sb.append("odd.");
			System.out.println(sb);
		}

		static void showSingleNumberResult(long number) {
			if (number < 0) {
				System.out.println("The first parameter should be a natural number or zero.");
			} else if (number == 0) {
				System.out.println("Goodbye");
				loop = false;
			} else {
				getSingleResult(number);
			}
		}

		static void showSequenceprojectnumbersResult(long number, long counter) {
			if (counter <= 0) {
				System.out.println("The second parameter should be a natural number.");
			} else {
				for (long i = 0; i < counter; i++) {
					getMultiplyResult(number++);
				}
			}
		}

		static void showFResult(long number, int counter, String[] input) {
			if (counter <= 0) {
				System.out.println("The second parameter should be a natural number.");
			} else if (isExclusive(input) || isExclusiveMinus(input)) {
				showExclusivesWarnings();
			} else if (isProperty(input)) {
				whichProperty(number, counter, input);
			} else {
				showWarn(input);
			}
		}
	}

	static class Properties {

		static boolean isProperty(String[] input) {
			List<String> aList = new ArrayList<>();
			for (int i = 2; i < input.length; i++) {
				if (!Arrays.asList(propertiesArray).contains(input[i])) {
					if (!Arrays.asList(propertiesArrayMinus).contains(input[i])) {
						return false;
					}
				} else {
					aList.add(input[i]);
				}
			}
			return Arrays.asList(propertiesArray).containsAll(aList)
					|| Arrays.asList(propertiesArrayMinus).containsAll(aList);
		}

		static void whichProperty(long number, int counter, String[] input) {
			boolean valid;
			while (counter > 0) {
				valid = true;
				for (int i = 2; i < input.length; i++) {
					switch (input[i]) {
						case "SPY" -> {
							if (!isSpy(number)) {
								valid = false;
							}
						}
						case "BUZZ" -> {
							if (!isBuzz(number)) {
								valid = false;
							}
						}
						case "DUCK" -> {
							if (!isDuck(number)) {
								valid = false;
							}
						}
						case "PALINDROMIC" -> {
							if (!isPalindromic(number)) {
								valid = false;
							}
						}
						case "GAPFUL" -> {
							if (!isGapful(number)) {
								valid = false;
							}
						}
						case "SUNNY" -> {
							if (!isSunny(number)) {
								valid = false;
							}
						}
						case "SQUARE" -> {
							if (!isSquare(number)) {
								valid = false;
							}
						}
						case "JUMPING" -> {
							if (!isJumping(number)) {
								valid = false;
							}
						}
						case "SAD" -> {
							if (isHappy(number)) {
								valid = false;
							}
						}
						case "HAPPY" -> {
							if (!isHappy(number)) {
								valid = false;
							}
						}
						case "EVEN" -> {
							if (!isEven(number)) {
								valid = false;
							}
						}
						case "ODD" -> {
							if (!isOdd(number)) {
								valid = false;
							}
						}
						case "-SPY" -> {
							if (isSpy(number)) {
								valid = false;
							}
						}
						case "-BUZZ" -> {
							if (isBuzz(number)) {
								valid = false;
							}
						}
						case "-DUCK" -> {
							if (isDuck(number)) {
								valid = false;
							}
						}
						case "-PALINDROMIC" -> {
							if (isPalindromic(number)) {
								valid = false;
							}
						}
						case "-GAPFUL" -> {
							if (isGapful(number)) {
								valid = false;
							}
						}
						case "-SUNNY" -> {
							if (isSunny(number)) {
								valid = false;
							}
						}
						case "-SQUARE" -> {
							if (isSquare(number)) {
								valid = false;
							}
						}
						case "-JUMPING" -> {
							if (isJumping(number)) {
								valid = false;
							}
						}
						case "-HAPPY" -> {
							if (isHappy(number)) {
								valid = false;
							}
						}
						case "-SAD" -> {
							if (!isHappy(number)) {
								valid = false;
							}
						}
						case "-EVEN" -> {
							if (isEven(number)) {
								valid = false;
							}
						}
						case "-ODD" -> {
							if (isOdd(number)) {
								valid = false;
							}
						}
						default -> throw new IllegalStateException("Unexpected value: " + input[i]);
					}
				}
				if (valid) {
					getMultiplyResult(number);
					number++;
					counter--;
				} else {
					number++;
				}
			}
		}

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
			for (int i = 0; i < str.length() / 2; i++) {
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

		static boolean isJumping(long number) {
			String str = String.valueOf((number));

			if (str.length() == 1) {
				return true;
			}

			int count = 1;

			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(i - 1) + 1 || str.charAt(i) == str.charAt(i - 1) - 1) {
					count++;
				}
				if (count == str.length()) {
					return true;
				}
			}
			return false;
		}

		static boolean isHappy(long number) {
			long result;
			int sum = 0;
			int count = 0;

			while (true) {
				while (number != 0) {
					result = (number % 10);
					sum += (int) Math.pow(result, 2);
					number /= 10;
				}

				if (sum != 1) {
					number = sum;
					sum = 0;
					count++;
				} else {
					return true;
				}

				if (count > 20) {
					return false;
				}
			}
		}

	}

	static class Warnings {

		static boolean isExclusive(String[] input) {
			if (!isProperty(input)) {
				return false;
			}
			List<String> aList = new ArrayList<>();
			for (int i = 2; i < input.length; i++) {
				for (int j = 2; j < input.length; j++) {
					if (input[i].equals("EVEN") && input[j].equals("ODD")
							|| input[i].equals("SPY") && input[j].equals("DUCK")
							|| input[i].equals("SUNNY") && input[j].equals("SQUARE")) {
						aList.add(input[i]);
						aList.add(input[j]);
						System.out.printf("The request contains mutually exclusive properties: %s \n", aList);
						return true;
					}
				}
			}
			return false;
		}

		static boolean isExclusiveMinus(String[] input) {
			if (!isProperty(input)) {
				return false;
			}
			List<String> aList = new ArrayList<>();
			for (int i = 2; i < input.length; i++) {
				for (int j = 2; j < input.length; j++) {
					if (input[i].equals("-ODD") && input[j].equals("-EVEN")) {
						aList.add(input[i]);
						aList.add(input[j]);
						System.out.printf("The request contains mutually exclusive properties: %s \n", aList);
						return true;
					} else {
						for (String s : propertiesArray) {
							if (input[i].equals(s) && input[j].equals("-" + s)) {
								aList.add(input[i]);
								aList.add(input[j]);
								System.out.printf("The request contains mutually exclusive properties: %s \n", aList);
								return true;
							}
						}
					}
				}

			}

			return false;
		}

		static void showExclusivesWarnings() {
			System.out.println("There are no numbers with these properties.");
		}

		static void showWarn(String[] input) {
			ArrayList<String> warnList = new ArrayList<>();

			// i = 2 because: 0 - number, 1 - counter
			for (int i = 2; i < input.length; i++) {
				if (!Arrays.asList(propertiesArray).contains(input[i])
						&& !Arrays.asList(propertiesArrayMinus).contains(input[i])) {
					warnList.add(input[i]);
				}
			}
			if (warnList.size() > 1) {
				System.out.printf("The properties %s are wrong. \n", warnList);
			} else {
				System.out.printf("The property %s is wrong. \n", warnList);
			}
			System.out.println("Available properties: " + Arrays.toString(propertiesArray));
		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Amazing Numbers!");
		System.out.println("Supported requests: ");
		System.out.println("- enter a natural number to know its properties;");
		System.out.println("- enter two natural numbers to obtain the properties of the list:");
		System.out.println("\t * the first parameter represents a starting number;");
		System.out.println("\t * the second parameter shows how many consecutive numbers are to be printed;");
		System.out.println("- two natural numbers and properties to search for;");
		System.out.println("- a property preceded by minus must not be present in numbers;");
		System.out.println("- separate the parameters with one space;");
		System.out.println("- enter 0 to exit");
		while (loop) {
			System.out.println("Enter a request:");
			input = scanner.nextLine().toUpperCase().split(" ");
			int len = input.length;

			try {
				if (len == 1) {
					number = Long.parseLong(input[0]);
					showSingleNumberResult(number);
				} else if (len == 2) {
					number = Long.parseLong(input[0]);
					counter = Integer.parseInt(input[1]);
					showSequenceprojectnumbersResult(number, counter);
				} else {
					number = Long.parseLong(input[0]);
					counter = Integer.parseInt(input[1]);
					showFResult(number, counter, input);
				}
			} catch (NumberFormatException e) {
				System.out.println("Both parameters should be a natural number.");
			}
		}
	}
}