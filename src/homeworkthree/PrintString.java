package homeworkthree;

import java.util.Scanner;

public class PrintString {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name=input.nextLine();
		int index=name.length()-1;
		
		while(index >= 0) {
			char let=name.charAt(name.length()-(1+index));
			System.out.print(let+" ");
			index--;
		}
		System.out.println("Enter a name: ");
		name=input.nextLine();
		index=name.length()-1;
		while(index >= 0) {
			char let=name.charAt(index);
			System.out.print(let+" ");
			index--;		
		}
		
	}
}
