package Day_01_DataType;

public class P06_ForLoopWith_IfElse_Switch {
	// static int i = 0;

	public static void main(String[] args) {
		int i = 0; // play with i=13; i>3 or i=50; i>20
		for (i = 13; i > 3; i--) {
			System.out.println(i);
		}
		System.out.println("Update Value " + i);
		switch (i) {
		case 1:
			System.out.println("Tipu");
			break;
		case 2:
			System.out.println("Koly");
			break;
		case 3:
			// inside if condition you have to put'=='
			if (i == 4) {
				System.out.println("Nothing");
			} else {
				System.out.println("Joba");
				break;
			}
		default:
			System.out.println("Ended");
			break;
		case 4:
			System.out.println("Shamun");
			break;
		}

	}

}
