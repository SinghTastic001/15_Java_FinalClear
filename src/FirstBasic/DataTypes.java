package FirstBasic;
// DATA TYPES ARE OF TWO TYPES : 
//1 PRIMITIVE DATA TYPE : a.integer (byte, int ,short,long)   b.character  c.Boolean (true or false)  4. float (double,float)
// 2.Non-Primitive Data Type :  String , Array , Object 
public class DataTypes {
	
	public static void main(String arg[]) {
//		by default it take double data type .......it has 8 bytes........... Explicitly type casting defined it float
		float mark = 3.5f;
		
		double mark1 = 6.5;
		
		
//	 byte - 1byte  , short - 2 byte , int - 4 byte , long - 8 byte
		int a = 10;
		byte by =127;
		short sh = 558;
		long l = 5843l;
		
//		Char- 2 bytes ........java char define single quote and .........string define double quote
		char b = 'a';
		
//		boolean- true or false 
		
		boolean c = true;
		
		System.out.println(mark);
		System.out.println(b);
		System.out.println(c);
	}

}
