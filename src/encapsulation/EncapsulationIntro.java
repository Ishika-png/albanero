package encapsulation;

public class EncapsulationIntro {
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(31);
		System.out.println(l1.getPrice());
	}
	
	
//	void doWork() {
//		System.out.println("working working");
//	}
}

class Laptop {
	int ram;
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("Not accessible");
		} else {
			this.price = price;
		}
	}
}
