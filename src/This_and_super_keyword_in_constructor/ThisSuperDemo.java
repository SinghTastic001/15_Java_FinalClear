package This_and_super_keyword_in_constructor;

class A{
	
	A(){
//		super(); by default java put here as first statement
		System.out.println("Non-paramaterised constructor OF A Class");
	}
	
	A(int a){
//		super(); by default java put here as first statement
		System.out.println("parameterised constuctor of Class A"+" "+a);
	}
}

class B extends A{
	
	B(){
//		super(); by default java put here as first statement
		super();
		System.out.println("Non-paramaterised constructor of Class B");
	}
	
	B(int b){
//		super(); by default java put here as first statement
//		super(20); access parameter constructor of parent class
//		this(); it also a first statement in constructor either super or this come dono ek shaat nhi aayega
//		this means current class object access
//		this access paramertised and non-parametersied constructor of own class
		this();
		System.out.println("parameterised constuctor of Class B"+" "+b);
	}
}



public class ThisSuperDemo {
	
	public static void main(String[] args) {
		
		B objb = new B(10);
//		non-paramaterised construtor call it give both parent and child class non-parameter constructor because it java put here inside constructor
//		super in first statement;
		
	
	}

}
