package Keyword_09;

class DemoStatic{
	
	int a = 20;
	static int b =100;
	
	static void getStat() {
		System.out.println("This s a static");
	}
	
	static {
		System.out.println("static example");
	}
}

public class Static_02 {
	
	public static void main(String[] args) {
		
//		System.out.println(DemoStatic.a);4
//		not possible to call non-static variable inside static method
		
//		DemoStatic.getStat();
//		System.out.println(DemoStatic.b);
		
//		static call inside static method
		
//		System.out.println(DemoStatic.b);
		
		
//		static variable use inside static method
//		but non-static variable cannot use static method this will possible by passing object inside method(as agurment)
	}

}
