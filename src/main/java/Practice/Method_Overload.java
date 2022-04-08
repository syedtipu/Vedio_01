package Practice;

public class Method_Overload {
	
	int a = 5;
	int b = 6;
  // without any parameter
	public void test () {
		System.out.println("without any parameter");
	}
	public void test (int x) {
	 System.out.println(x);
	}
	public void test (int x, int y) {
		System.out.println(x*y);
	}
	public void test (int x, double y) {
		System.out.println(x*y);
	}
	public int test (int x, int y, int v) {
		return(x+y+v);
	}
  public static void main(String[] args) {
	  Method_Overload mm = new Method_Overload();
	  mm.test();
}
	
}
