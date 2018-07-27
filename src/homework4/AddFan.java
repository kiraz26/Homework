package homework4;

public class AddFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina", "Peter", "Sara" };
		String namesWithFan[];
		String fan = "";

		for (String str : names) {
			fan += str + "fan, ";
		}
		namesWithFan = fan.split(",");

		for (int i = 0; i < namesWithFan.length; i++) {
			System.out.print(namesWithFan[i]);
		}

	}

}
