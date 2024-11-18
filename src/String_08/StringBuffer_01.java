package String_08;

//StringBuffer is mutuable String and thread safe
// StringBuilder is mutuable stringa and it is not thread safe
public class StringBuffer_01 {
	
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Shubhi%Singh");
		name.replace(3, 7, " ");
		System.out.println(name.length());
		name.append("Engineer");
		System.out.println(name);
		name.reverse();
		System.out.println(name);
		name.delete(5,name.length());
		System.out.println(name);
	}
	
	

}
