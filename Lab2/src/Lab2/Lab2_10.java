package Lab2;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

	class ShoppingCart {
		Product[] items = new Product[10];
		int itemCount = 0;

		void addProduct(Product p) {
			items[itemCount] = p;
			itemCount++;
		}

		double calculateTotalPrice() {
			double total = 0;
			for (int i = 0; i < itemCount; i++) {
				total += items[i].price;
			}
			return total;
		}
	}

		public class Lab2_10 {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				scanner.nextLine();

				ShoppingCart cart = new ShoppingCart();

				for (int i = 0; i < n; i++) {
					String name = scanner.nextLine();
					double price = scanner.nextDouble();
					scanner.nextLine();

					Product p = new Product(name, price);
					cart.addProduct(p);
				}

				System.out.println(cart.calculateTotalPrice());

				scanner.close();
			}

		}
