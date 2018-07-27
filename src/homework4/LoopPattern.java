package homework4;

public class LoopPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dot = ".... ";
		int k = 0;

		DOT: for (int index = dot.length() - 1; index >= 0; index--) {

			// System.out.println(dot);
			for (int j = 1; j < 6; j++) {
				k += j;

				System.out.println(dot.substring(0, index) + "" + k);
				continue DOT;
			}

		}

	}

}
