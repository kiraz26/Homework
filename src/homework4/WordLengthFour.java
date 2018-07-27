package homework4;

public class WordLengthFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina", "Peter", "Sara" };
		String namesLengthFour[];
		String four = "";

		for (String str : names) {
			if (str.length() == 4) {

				four += str + ",";

			}
		}

		namesLengthFour = four.split(",");

		for (int i = 0; i < namesLengthFour.length; i++) {
			System.out.println(namesLengthFour[i]);
		}

	}

}
