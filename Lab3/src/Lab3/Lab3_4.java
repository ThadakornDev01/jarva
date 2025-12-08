package Lab3;
import java.util.Scanner;

class Product1 {
	private String name2;
	private static int productCount2 = 0;
	// static เริ่มต้นที่ 0

	Product1(String name2) {
		this.name2 = name2;
		productCount2++;
	}
	
	public String getName() {
		return this.name2;
	}
	
	public static int getProductCount() {
		return productCount2;
	}
}

public class Lab3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		// เคลียร์ buffer บรรทัดใหม่
		
		for (int i = 0; i < n; i++) {
			String name2 = scanner.nextLine();
			new Product1(name2);
		}
		
		// เรียกใช้ผ่านชื่อ Class Product
		System.out.print(Product1.getProductCount());
		scanner.close();
	}
}
