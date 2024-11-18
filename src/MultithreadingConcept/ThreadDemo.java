package MultithreadingConcept;

//it is a first way of creating thread
//it is one way to perform multithreading

class Thread1 extends Thread{
	
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Thread 1:"+i);
		}
	}
}

class Thread2 extends Thread {
	
	public void run() {
		for(int i=1; i<13; i++) {
			System.out.println("Thread 2:"+i);
		}
	}
}

class Thread3 extends Thread{
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 3:"+i);
		}
	}
}
public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
//		t1.run(); it take more time
		
		t1.start();
		Thread2 t2 = new  Thread2();
//		t2.run(); it take moretime
		t2.start();
		
		Thread3 t3 = new Thread3();
//		t3.run();  it take moretime
		
		t3.start();
	}

}
