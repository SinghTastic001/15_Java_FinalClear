package Operators_02;

public class LogicalOp03 {
	
	public static void main(String[] args) {
		
//		Logical operator in java :- && (ampersand)  , || (pipe symbol)  ,  !=  (not equal to)
		int a = 20;
		int b = 40;
		
		System.out.println((a>b)&&(a>=b));
		System.out.println((a<b) && (a!=b));
		System.out.println((a>b) || (a<b));
		
		System.out.println (!(a<b));
		
	}

}
