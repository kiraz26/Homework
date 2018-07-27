package homework;

import java.util.Scanner;

public class EvenOdd {

	private static boolean isEven() {
		boolean isEven=true;
		return isEven;
	}
	private static boolean isOdd() {
		boolean isOdd=false;
		return isOdd;
	
}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=input.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+ " is even: "+isEven());
			System.out.println(num+ " is odd: "+isOdd());
		}else if(num%2 != 0) {
			System.out.println(num+ " is even: "+isOdd());
			System.out.println(num+ " is odd: "+isEven());
		}
	}
		
		
}