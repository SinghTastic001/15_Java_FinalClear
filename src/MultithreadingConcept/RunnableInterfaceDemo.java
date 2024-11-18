package MultithreadingConcept;


class Th8 implements Runnable{
//	Thread t8 = new Thread(th8)
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 8:"+i);
		}
	}
}

class Th9 implements Runnable{
	Thread tt = new Thread(new Th10());
//	here thread object is made for join
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 9:"+i);
			try {
				tt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			here join method in thread use
		}
	}
}

class Th10 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 10:"+i);
		}
	}
}

class Th11 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 11:"+i);
		}
	}
}


public class RunnableInterfaceDemo {
	
	public static void main(String[] args) {
		
		Th8 th8 = new Th8();
//		th8.run();
//		th8.start();
		Thread t8 = new Thread(th8);
		t8.start();
		
		Th9 th9 = new Th9();
//		th9.run();  wrong
//		th8.start(); wrong
		Thread t9 = new Thread(th9);
		t9.start();
		
		Th10 th10 = new Th10();
//		th10.run();
		Thread t10 = new Thread(th10);
		t10.start();
		
		Th11 th11 = new Th11();
//		th11.run();
		Thread t11 = new Thread(th11);
		t11.start();
	}

}
