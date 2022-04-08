package Day_01_DataType;

public class P04_For_Loop_Iterator {
	static String x = "Syed";
	static String y = "Koly";
    //you have to put 'static' word before you declare any global/instance variable
	public static void main(String[] args) {
		/*
		 * class{} method() {} inside '()' there will be condition if () {} inside '()'
		 * there will be condition switch() {} inside '()' there will be condition for
		 * () {} There will be three part inside '()', 1st- condition, 2nd-
		 * initialization, 3rd- increment/decrement *for increment use '<' in 2nd part
		 * and '++' in 3rd part *for decrement use '>' in 2nd part and '--' in 3rd part
		 * or use *or use '<='/'>=' in second part to get proper number as per
		 * requirement while () {}
		 */
		// String x = "Syed";
		// (int i=0; i<5; i++) will print 'Syed' 5 times
		for (int i = 1; i < 5; i++) {
			System.out.println(x);
		}
		// (int i=0; i<=5; i++) will print 'Syed' for 6 times as index starts from 0
		// if you give i=1 or any thing other than o than you have to put '<=' or put
		// '<6' to get up to 5

		// String y = "Koly";
		// (int m=5; m>0; m--) will print 'Koly' for 5 times
		// (int m=5; m>2; m--) will print 3 times. now try to understand the logic.
		for (int m = 5; m > 2; m--) {
			System.out.println(y);
		}
	}

}
