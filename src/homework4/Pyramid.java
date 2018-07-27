package homework4;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String star = "*";
		String space = "   ";
		for (int j = 0; j < 4; j++) {

			String space2 = space.substring(j);

			System.out.println(space2 + star);

			star += "**";

		}

	}

}
