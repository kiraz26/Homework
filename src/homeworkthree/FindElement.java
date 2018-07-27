package homeworkthree;

import java.util.Scanner;

public class FindElement {

	String[] colors = { "Red", "Blue", "Black", "Green", "Orange", "Brown" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] colors = { "Red", "Blue", "Black", "Green", "Orange", "Brown" };
		System.out.println("Enter a color: ");
		String color = input.next();

		int position = -1;
		for (int i = 0; i < colors.length; i++) {
			if (color.equalsIgnoreCase(colors[i])) {
				position = i;

				break;
			}

		}
		System.out.println(position);
	}
}
