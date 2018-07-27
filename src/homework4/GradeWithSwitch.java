package homework4;

import java.util.Scanner;

public class GradeWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade:");
		grade = input.next().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good Job");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade: ABCDF only");
		}
	}

}
