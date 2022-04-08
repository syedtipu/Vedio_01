package Day_01_DataType;

public class P05_If_Inside_ForLoop_with_BreakOrContinue {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < 10; i++) {

			if (i == 4) {
				break;
			}
			System.out.println(i);
			//when you give 'continue;' here it will print all value accept the value inside if condition.
			// and when you give 'break;' here it will print all value up to 3 for the condition inside if.
		}
		System.out.println("update " +i);
		//it will print 10 if you give 'continue;' and will print 4 if you give 'break;'
		
	}

}
