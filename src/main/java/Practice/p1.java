package Practice;

public class p1 {
	public static void main(String[] args) {
		String name = "Raju";
		if (name.contains("Raju")) {
			System.out.println("Bronx");
			if (name.contains("Raju")) {
				System.out.println("Ozone Park");
				if (name.contains("Raju")) {
					System.out.println("Manhattan");
				} else if (name.contains("Tipu")) {
					System.out.println("Staten Island");
				} else if (name.contains("Raju")) {
					System.out.println("Ozone Park");
				}
			}
		} else {
			System.out.println("Brooklyn");
		}

	}

}
