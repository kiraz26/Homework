package homework;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the letter:");

		String letter = input.nextLine();

		letter = letter.toLowerCase();

		if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
				|| letter.equals("u")) {
			System.out.println("Letter is vowel");
		} else if (letter.equals("b") || letter.equals("c") || letter.equals("d") || letter.equals("f")
				|| letter.equals("g") || letter.equals("h") || letter.equals("j") || letter.equals("k")
				|| letter.equals("l") || letter.equals("m") || letter.equals("n") || letter.equals("q")
				|| letter.equals("p") || letter.equals("r") || letter.equals("s") || letter.equals("t")
				|| letter.equals("v") || letter.equals("y") || letter.equals("x") || letter.equals("w")
				|| letter.equals("z")) {
			System.out.println("Letter is consonant");
		} else if (letter.length() >= 2) {
			System.out.println("ERROR! Please enter one letter!!!");
		} else {
			System.out.println("ERROR! Please enter letter!!!");

		}

	}

}
