package OOP_05;

class Calculate{
	
	int a =  10;
	int b = 20;
	
	void getSum() {
		System.out.println(a+b);
	}
	
	public int getMu() {
		System.out.println("Multiply");
		return a*b;
	}
}

public class ClassDemo01 {

	public static void main(String[] args) {
//		here we create object of class calculate
//		Calculate (class) , cal (reference variable) , new (keyword used to assign new space) , Calculate() (constructor it also called special method)
		Calculate cal = new Calculate();
		cal.getSum();
		System.out.println(cal.a);
		System.out.println(cal.b);
//		System.out.println(cal.getMu());
		int c = cal.getMu();
		System.out.println(c);
		
	}
}
