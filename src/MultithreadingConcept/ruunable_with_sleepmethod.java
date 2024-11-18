package MultithreadingConcept;

// here sleep method is used
class Extd implements Runnable{

	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 8:"+i);
			Thread.yield();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}

class Extd1 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 9:"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Extd2 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 10:"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ruunable_with_sleepmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		Th8 Extd = new Th8();
		Thread t1 = new Thread(Extd);
		t1.start();
		
		Th9 Extd1 = new Th9();
		Thread t2 = new Thread(Extd1);
		t2.start();
		
		Th10 Extd2= new Th10();
		Thread t3 = new Thread(Extd2);
		t3.start();
		
		for(int i=1; i<3; i++) {
			System.out.println("END sleep method herer in main program");
			Thread.sleep(5000);
		}
	}

}
