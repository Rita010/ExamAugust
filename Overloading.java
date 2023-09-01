package exam;

public class Overloading {

	public static void main(String[] args) {

		// 4. Define a example for Overloading
		
		addition(2,3);
		addition(2,3,4);
		addition(2,3,4,5);
	
		
	}
		
	

	public static void addition(int a, int b) {
		System.out.println(a+b);
	}
	public static void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void addition (int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
}
