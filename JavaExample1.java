package sDETBatch006;

public class JavaExample1 {

		private void method1() {
			System.out.println("Hello");
		}
		
		private int a = 10;
		private String str = "SDET";
		public static void main(String[] args) {
			JavaExample1 je1 = new JavaExample1();
			
			System.out.println(je1.a);
			System.out.println(je1.str);
			je1.method1();
			
		}
		
}
class OutsideOnTheClass {

	public static void main(String[] args) {
		
//		JavaExample1  je1 = new JavaExample1();
//		
//		System.out.println(je1.a);
//		System.out.println(je1.str);
//		je1.method1();
	}
}

