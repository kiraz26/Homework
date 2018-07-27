package homework4;

import java.util.Scanner;

public class MultipleChoiseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n"
				+ "a.int 1x=10;\n" + "b.int x =10;\n" + "c.float x =10.0f;\n" + "d.string x=\"10\";");
		System.out.println();
		System.out.println("Enter an answer:");
		char answer = input.next().charAt(0);

		switch (answer) {
		case 'a':
			System.out.println("False");
			break;
		case 'b':
			System.out.println("True");
			break;
		case 'c':
			System.out.println("False");
			break;
		case 'd':
			System.out.println("False");
			break;
		default:
			System.out.println("Please an valid answer!!! (a, b, c, d");
		}

	}

}
