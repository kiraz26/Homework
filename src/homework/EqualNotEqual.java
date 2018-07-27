package homework;

import java.util.Scanner;

public class EqualNotEqual {

	private static boolean isNotEqual() {
		boolean isNotEqual = false;
		return isNotEqual;
	}

	private static boolean isEqual() {
		boolean isEqual = true;
		return isEqual;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();

		if (num1 != num2) {
			System.out.println(num1 + " and " + num2 + "  are equal: " + isNotEqual());
			System.out.println(num1 + " and " + num2 + " are not equal: " + isEqual());
		} else if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + "  are equal: " + isEqual());
			System.out.println(num1 + " and " + num2 + " are not equal: " + isNotEqual());
		}

	}
}
