package Lab4;
import java.util.Scanner;

class Product1{
	private String name;
	private double price;
	
	public Product1(String name){
		this(name, 0.0);
	}
	
	public Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displyInfo() {
		System.out.println("Prifuct " + name + ", Price: " + price);
	}
}

public class Lab4_2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int mode = scanner.nextInt();
	scanner.nextLine();
	
	Product1 product1 = null;
	
	if(mode == 1) {
		String name = scanner.nextLine();
		product1 = new Product1(name);
	} else if (mode == 2) {
		String name = scanner.nextLine();
		double price = scanner.nextDouble();
		product1 = new Product1(name, price);
	}
	
	if (product1 != null) {
		product1.displyInfo();
	}
	scanner.close();
	}

}
