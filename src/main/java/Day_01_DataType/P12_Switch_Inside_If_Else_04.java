package Day_01_DataType;

public class P12_Switch_Inside_If_Else_04 {
	public static void main(String[] args) {
		String x="4";
		if (x.contains("2")) {
			System.out.println("Dhaka");
			if (x.contains("2")) {
				System.out.println("Commila");
				if (x.contains("4")) {
					System.out.println("Feni");
					switch (x) {
					case "4":
						System.out.println("Feni");
						break;

					default:
						System.out.println("Nothing");
						break;
					}
				}
			}
		}
		else {
			System.out.println("Bangladesh");
		}
	}

}
