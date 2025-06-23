package sDETBatch006;

public class JavaExample2 {

	protected void method1() {
		System.out.println("Hello");
	}

	protected int a = 10;

	protected String str = "SDET";

	public static void main(String[] args) {

	}
}

class OutSideontheClass {
	public static void main(String[] args) {

		JavaExample2 je = new JavaExample2();
		System.out.println(je.a);
		System.out.println(je.str);
		je.method1();
	}
}