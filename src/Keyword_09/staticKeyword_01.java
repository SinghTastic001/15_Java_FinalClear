package Keyword_09;

class Mobile{
	
	int price;
	String name;
	static String Brand;
	
	public void getData(int price,String name,String Brand) {
		this.price = price;
		this.name = name;
		this.Brand = Brand;
		System.out.println(price +" "+name+" "+Brand);
	}
}

public class staticKeyword_01 {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.getData(1000, "smartphone", "apple");
		
//		mobile.name = "phone";
//		static call direct class ke through not object need to make..............static use inside static use class name to access not object
//		static variable  call with class name
		
		Mobile m1 = new Mobile();
		m1.getData(2000,"smt","Samsungs");
		
		
		
	}

}
