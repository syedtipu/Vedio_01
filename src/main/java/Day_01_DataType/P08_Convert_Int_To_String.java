package Day_01_DataType;

public class P08_Convert_Int_To_String {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
		}
		// To convert integer to String, write 'String obj =' then 'String.' then select
		// 'valueOf(i)' from the list.
		String x = String.valueOf(i);
		
		
		// x = "4"; //no need to use this line as well after conversion.

		switch (x) {
		case "1":
			System.out.println("Dhaka");
			break;
		case "2":
			System.out.println("Madaripur");
			break;
		case "3":
			System.out.println("Habigonj");
			break;
		case "5":
			System.out.println("Feni");
			break;
		case "4":
			if (x.contains("7")) {
				System.out.println("Barisal");
			} else {
				System.out.println("Sylhet");
			}
		}
		
	}

}
