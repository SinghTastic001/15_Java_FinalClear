package Keyword_09;

class A{
	
	int age;
	String name;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
}

public class ThisKeyword_03 {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.setAge(12);
		a.setName("shubhi");
		System.out.println(a.getAge());
		System.out.println(a.getName());
	}

}
