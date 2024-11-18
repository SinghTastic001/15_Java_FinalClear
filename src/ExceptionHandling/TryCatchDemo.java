package ExceptionHandling;

import java.io.FileReader;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
//		it give arithmeticexception it called runtime exception
		try {
			System.out.println("hello");
			System.out.println(a/b);
			System.out.println("Uper code has error");
		}catch(Exception e) {
//			Exception is a class and e is a method
			System.out.println(e);
		}
		System.out.println("terminate last code execute the uper provide arthmetic exception");
		
//		it called compile time exception
		try {
			FileReader file = new FileReader("C:\\Users\\shubu\\OneDrive\\Documents\\file_function1.txt");
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
