package homework;
import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of month:");
		int month=input.nextInt();
		if(month == 1) {
			System.out.println("January has 31 days");
		}else if(month == 2) {
			System.out.println("February has 29 days");
		}else if(month == 3) {
			System.out.println("March has 31 days");
		}else if(month == 4) {
			System.out.println("April has 30 days");
		}else if(month == 5) {
			System.out.println("May has 31 days");
		}else if(month == 6) {
			System.out.println("June has 30 days");
		}else if(month == 7) {
			System.out.println("July has 31 days");
		}else if(month == 8) {
			System.out.println("August has 31 days");
		}else if(month == 9) {
			System.out.println("September has 30 days");
		}else if(month == 10) {
			System.out.println("October has 31 days");
		}else if(month == 11) {
			System.out.println("November has 30 days");
		}else if(month == 12) {
			System.out.println("December has 31 days");
		}
		
	}

}
