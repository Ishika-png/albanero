package multithreading;

//using runnable interface
class Hey implements Runnable {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hey");
			try {
				Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
	}
}

class Bye implements Runnable {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Bye");
			try {
				Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
	}
}

public class MultithreadingRunnable {

	public static void main(String[] args) {
		Hey obj1 = new Hey();
		Bye obj2 = new Bye();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e){
			
		}
		
		t2.start();
	}

}
