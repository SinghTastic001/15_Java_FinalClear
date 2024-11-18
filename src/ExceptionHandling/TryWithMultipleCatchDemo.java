package ExceptionHandling;

public class TryWithMultipleCatchDemo {
	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		String name=null;
		
		try {
			
			System.out.println(a/b);
			System.out.println(name.toUpperCase());
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

//default exception comes in a last order
//interview question
//compile time error
