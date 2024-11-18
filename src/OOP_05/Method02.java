package OOP_05;

class Computer{
	
	Computer(int a){
		System.out.println(a);
		System.out.println("Custome constructor");
	}
	
	
	public void getInfo() {
		System.out.println("ccomputer info");
	}
	
	public String getMePen(int num) {
		if(num>1000) {
			return "Pen";
		}else {
			return "Nothing";
		}
			
	}
}

public class Method02 {
	
	public static void main(String[] args) {
		Computer cm = new Computer(10);
		cm.getInfo();
		String store = cm.getMePen(100);
		System.out.println(store);
	}

}
