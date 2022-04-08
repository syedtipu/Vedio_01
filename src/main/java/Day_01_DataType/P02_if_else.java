package Day_01_DataType;

public class P02_if_else {

	public static void main(String[] args) {

		String x = "4";
		if (x.contains("4")) {
			System.out.println("Dhaka");
		} 
		else if (x.contains("3")) { 
			System.out.println("Sylhet");
		} 
		else if (x.contains("2")) {
			if (x.contains("4")) {
				System.out.println("Feni");
				if (x.contains("4")) {
					switch (x) {
					case "3":
						System.out.println("sad");
						break;
					case "2":
						System.out.println("mad");
						break;
					case "5":
						System.out.println("bad");
						break;
					case "10":
						if (x.contains("0")) {
							System.out.println("lad");
						} else {
							System.out.println("fad");
						}
						break;
					default:
						System.out.println("Nothing");
					}
				}
			}
		} else {
			System.out.println("Bangladesh");
		}
		System.out.println("Bangladesh");
	}
  ////
}
