package multithreading;

// using thread class
class Hii extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
	}
}

class Helloo extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
	}
}


public class MultithreadingSampleClass {

	public static void main(String[] args) {
		Hii obj1 = new Hii();
		Helloo obj2 = new Helloo();
		
		obj1.start();
		
//		try {
//			Thread.sleep(10);
//		} catch (Exception e){
//			
//		}
		
		obj2.start();
	}

}
