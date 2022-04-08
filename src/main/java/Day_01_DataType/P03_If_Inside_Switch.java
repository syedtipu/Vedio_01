package Day_01_DataType;

public class P03_If_Inside_Switch {
	public static void main(String[] args) {

		String x = "55";

		switch (x) {
		case "55":
			System.out.println("Dhaka");
			break;
		case "22":
			System.out.println("Madaripur");
			break;
		case "33":
			System.out.println("Habigonj");
			break;
		case "44":
			System.out.println("Feni");
			break;
		case "66":
			if (x.contains("54")) {
				System.out.println("Barisal");
			} else {
				System.out.println("Sylhet");
			}
		}

		System.out.println("Tipu");
	}
}
