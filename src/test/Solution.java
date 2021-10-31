package test;


import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long number = scanner.nextLong();

		long result;
		int sum = 0;

		while (sum != 1) {

			while (number != 0) {
				result = number % 10;
				sum += (int) Math.pow(result, 2);
				number /= 10;
			}

			if (sum != 1) {
				number = sum;
				sum = 0;
			} else {
				System.out.println("OK");
			}



		}


		System.out.println(sum);
		System.out.println(number);
	}
}
