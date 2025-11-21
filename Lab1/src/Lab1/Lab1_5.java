package Lab1;
import java.util.Scanner;
public class Lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		
		if(num1 == 1)
			System.out.print("Americano");
		else if (num1 == 2)
			System.out.print("Latte");
		else if (num1 == 3)
			System.out.print("Espresso");
		else if (num1 == 4)
			System.out.print("Mocha");
		else 
			System.out.print("Invalid Menu");
		
		input.close(); 

	}

}
