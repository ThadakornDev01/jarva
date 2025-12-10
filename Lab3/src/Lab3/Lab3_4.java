package Lab3;
import java.util.Scanner;

class Product1 {
    private String name;

    private static int productCount = 0;

    public Product1(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }
}
public class Lab3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
        
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String productName = scanner.nextLine();
            
            new Product1(productName);
        }

        System.out.println(Product1.getProductCount());
        
        scanner.close();
	}
	
}
