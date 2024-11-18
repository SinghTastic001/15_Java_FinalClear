package MultiThreading;

class Thread1 extends Thread{
	
	public void run(){
		System.out.println("This is a class thread1");
		for(int i=1; i<=10; i++) {
			System.out.println("Thread1: "+i);
		}
	}
}

class Thread2 extends Thread{
	
	public void run() {
		System.out.println("This is a thread2");
		for(int i=1; i<=10; i++) {
			System.out.println("thread2: "+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2  = new Thread2();
		t2.start();
	}
}
