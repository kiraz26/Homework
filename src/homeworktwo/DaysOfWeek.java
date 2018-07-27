package homeworktwo;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of day:");
		int day = input.nextInt();

		switch (day % 7) {
		case 1:
			System.out.println("Day of the week is Monday");
			System.out.println("It is a work day.");
			break;
		case 2:
			System.out.println("Day of the week is Tuesday");
			System.out.println("It is a work day.");
			break;
		case 3:
			System.out.println("Day of the week is Wednesday");
			System.out.println("It is a work day.");
			break;
		case 4:
			System.out.println("Day of the week is Thursday");
			System.out.println("It is a work day.");
			break;
		case 5:
			System.out.println("Day of the week is Friday");
			System.out.println("It is a work day.");
			break;
		case 6:
			System.out.println("Day of the week is Saturday");
			System.out.println("It is a holiday.");
			break;
		case 7:
			System.out.println("Day of the week is Sunday");
			System.out.println("It is a holiday.");
			break;
		default:
			System.out.println(" AGAIN ");
			break;
		}

	}

}
