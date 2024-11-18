package FirstBasic;

public class ConversionAndTypeCasting03 {

	public static void main(String[] args) {
		
//		Type casting :- 1. Implicit conversion           2.Explicit Conversion
		
		int num1 = 10;
		float f1 = 7.8f;
		
		num1 = (int) f1; 
//		#explicit type casting
		f1 =  num1;
//		implicit type casting
		
		char ch = 's';
		int in = ch; 
		
		int in1 = 310;
		char ch1 = (char) in1;
		System.out.println(in);
		System.out.println(ch1);
		
		System.out.println(num1);
		System.out.println(f1);
	}
}
