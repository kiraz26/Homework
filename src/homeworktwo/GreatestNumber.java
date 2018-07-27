package homeworktwo;

import java.util.Scanner;

public class GreatestNumber {
	int num1;
	int num2;
	int num3;
	
	public int greatestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest number is " );
			return num1;
		} 
		else if (num2 > num1 && num2 > num3) {
			System.out.println("The greatest number is " );
			return num2;
		} 
		else if (num3 > num1 && num3 > num2) {
			System.out.println("The greatest number is " );
			return num3;
		}else {
			System.out.println("Error");
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = input.nextInt();
		System.out.println("Enter second number:");
		int num2 = input.nextInt();
		System.out.println("Enter third number:");
		int num3 = input.nextInt();

		GreatestNumber getGreatest=new GreatestNumber();
		int getGreatest1=getGreatest.greatestNumber(num1, num2, num3);
		System.out.println(getGreatest1);

	}

}
