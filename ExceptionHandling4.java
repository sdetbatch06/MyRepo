package sDETBatch006;

public class ExceptionHandling4 {

	static double balance = 99.99;
	static double withdrawamt = 100;
	public static void main(String[] args) {
		
		if(balance>=withdrawamt) {
			System.out.println("Please Take Your Money");
		}
		else {
//			System.out.println("Insufficient Balance");
			throw new ArithmeticException("Insifficient Balance, Please check your Balance amt");
		}

	}

}
