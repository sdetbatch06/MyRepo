package sDETBatch006;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling3 {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("C:\\Users\\admin\\Desktop\\Test.txt");
	
		System.out.println("Hello");
		Thread.sleep(5000);
		
		System.out.println("Bye");
	}
}
