package Loop_04;

// initialise variable , declare while loop, condition then increment or decrement
public class WhileLoop01 {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i<6) {
			System.out.println("hello"+i);
			int j = 1;
//			it is a nested while loop also
			while(j<4) {
				System.out.println("hiii"+j);
				j++;
			}
			i++;
		}
		
	}

}
