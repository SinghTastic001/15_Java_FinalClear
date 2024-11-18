package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Demo{
	
	void readFile(String path) throws FileNotFoundException{
		FileReader fr = new FileReader(path);
	}
}

public class ThrowsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Demo d = new Demo();
		try {
			d.readFile("data.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
