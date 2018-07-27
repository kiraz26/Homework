package homeworkthree;

public class DivideBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 50;
		while (number <= 100) {
			number++;
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("This number can divide without remainder: " + number);
			}

		}

	}

}
