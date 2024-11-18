package String_08;

// String are object , non-primitive data type also called class
//  It is immutable 
//here SCP (String Constant Pool)memory and heap memory concept come for why it is immutable
public class StringDemo_01 {
	
	public static void main(String[] args) {
		
//		String name = new String("Shubhi");   it is also a way to declare a string
		
		String name = "Shubhi";
		String surname = new String("singh");
//		name=name.toUpperCase();
//		name.toUpperCase();
		System.out.println(name);
		System.out.println(surname);
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		
		
		
//		new concept is here related to compare string content and it's id
		
		String name1 = "Shubhi Singh";
		String name2 = "Shubhi";
		
		String name3 = new String("Shubhi");
		String name4 = new String("SHUBHI");
		
		System.out.println(name1==name2);
//		id are same
		System.out.println(name3==name1);
//		id are different 
		
		System.out.println(name1.equalsIgnoreCase(name4));
		System.out.println(name2.equalsIgnoreCase(name4));
		
		
		String s1 = "singh";
		String s2 = "singh";
		System.out.println(s1.compareTo(s2));
//		same string return 0 in compareTo
		
		
		String s3 = "Sinh";
		String s4 = "Singh";
		System.out.println(s3.compareTo(s4));
//		if first is bigger than return positive compare based on alpha number
		
		String s5 = "Sinch";
		String s6 = "Sinkk";
		System.out.println(s5.compareTo(s6));
		
//		System.out.println(name1.split(" "));
//		System.out.println(name1[0]);
		
		System.out.println(name1.substring(1,5));
		
		String[] arrysplitted = name1.split(" ");
		System.out.println(arrysplitted[0]);
		
		System.out.println(name1.indexOf("shubhi"));
//		
//		endsWith , startsWith , concat, replace	
		
		
	}

}
