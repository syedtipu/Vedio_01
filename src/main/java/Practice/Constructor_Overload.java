package Practice;

public class Constructor_Overload {
	int a = 2;
	int b = 3;

	public Constructor_Overload() {
		System.out.println("No Parameter");
	}
    public Constructor_Overload(int x) {
    	System.out.println(x);	
	}
    public Constructor_Overload(String name) {
    	System.out.println(name);
    }
    public Constructor_Overload(int x, double y) {
    	System.out.println(x/y);
    }
    public Constructor_Overload(int x, int y) {
    	System.out.println(x*y);
    }
    public static void main(String[] args) {
		new Constructor_Overload("baras");
		//Method_Overload mm = new Method_Overload();
		//mm.test(5, 5);
	}
}
