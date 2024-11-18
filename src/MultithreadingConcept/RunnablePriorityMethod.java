package MultithreadingConcept;
//Every thread have normal priority which is 5 , and max priority which has 1 and minimum priority which have 10
class Extd11 implements Runnable{

	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 11:"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}

class Extd12 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 12:"+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class Extd13 implements Runnable{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread 13:"+i);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
public class RunnablePriorityMethod {
	
	public static void main(String[] args) throws InterruptedException {
			
			Th8 Extd11 = new Th8();
			Thread t1 = new Thread(Extd11);
			t1.start();
			
			Th9 Extd12 = new Th9();
			Thread t2 = new Thread(Extd12);
			t2.start();
			
			Th10 Extd13 = new Th10();
			Thread t3 = new Thread(Extd13);
			t3.start();
			t3.setPriority(10);
			
//			System.out.println(Extd11.getPriority());
	
	}
}
