package Day_01_DataType;

public class P11_Switch_Inside_If_Else_03 {
	public static void main(String[] args) {

		String x = "4";
		if (x.contains("4")) {
			System.out.println("Commila");
			if (x.contains("4")) {
				switch (x) {
				case "1":
					System.out.println("a");
					break;
				case "2":
					System.out.println("b");
					break;
				case "3":
					System.out.println("c");
					break;
				case "4":
					if (x.contains("2")) {
						System.out.println("d");
					} else {
						System.out.println("e");
					}
					break;
				default:
					System.out.println("Nothing");
					break;
				}
			}
		}

	}

}
