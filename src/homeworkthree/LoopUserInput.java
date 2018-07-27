package homeworkthree;

import java.util.Scanner;

public class LoopUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String letter;

		do {
			System.out.println("Enter a letter:");
			letter = input.nextLine();
			if (letter.equals("y") || letter.equals("Y") || letter.equals("n") || letter.equals("N")) {
				System.out.println("Good Job");
				break;
			}

		} while (!letter.equals("Y") || !letter.equals("y") || !letter.equals("n") || !letter.equals("N"));

	}

}
