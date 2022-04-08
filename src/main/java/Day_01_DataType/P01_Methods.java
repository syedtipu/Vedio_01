package Day_01_DataType;

public class P01_Methods {
    
	static int x = 4;
	static int y = 6;
	public static void main(String[] args) {
		
	/**
	 * when a variable is inside the class but outside the method we call it a global variable or instance variable
	 * type main then Ctrl + Space == to create main method.
	 * when a variable inside a method as well is called local variable.
	 * difference between global and local variable?
	 * Ans: all the methods inside a class can find the global variable, but local variable can be found only by the method -
	 * -where the variable is defined. Global variable can access within the class, where lacel variable can access only -
	 * - within the method. Instance/global variable are declared inside the class but outside the method. local variables -
	 * -are declared inside the method.
	 * 
	 */
		
		//System.out.println(x);
		gopro();
		name();
	}
	
	public static void name() {
		
		System.out.println("Value of x "+x);
		
	}
	public static void gopro() {
		System.out.println("Value of y "+y);
	}
}
