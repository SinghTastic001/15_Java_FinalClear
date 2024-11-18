package ConditionalStatement_03;

public class UpdateSwitchCase {
	
	public static void main(String[] args) {
		
		String name = "sunday";
		String result = "";
		
		switch(name) {
		
			case "monday" -> result=("monday");
			default -> result=("default");
			case "saturday","sunday" -> result=("sleep");
		}
		System.out.println(result);
	}

}
