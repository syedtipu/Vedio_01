package Practice;

public class This {
	int a = 5;
	int b = 6;
	
	public void test_01() {
		this.a=b;
		//a = 10;
		System.out.println(a);
	}
	
	public void test_02()  {
		
		
	}
	
	public static void main(String[]args) {
		
	This run = new This();
	run.test_01();
	}

}
