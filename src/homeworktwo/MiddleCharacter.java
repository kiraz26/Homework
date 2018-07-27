package homeworktwo;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your word:");
		String word = input.nextLine();

		if (word.length() % 2 == 0) {
			int x = word.length() / 2;
			word.charAt(x);
			word.charAt(x - 1);
			System.out.println("The middle character in the word: " + word.charAt(x-1) + " and " + word.charAt(x));

		} else {
			int x = word.length() / 2;
			word.charAt(x);
			System.out.println("The middle character in the word: " + word.charAt(x));
		}

	}

}
