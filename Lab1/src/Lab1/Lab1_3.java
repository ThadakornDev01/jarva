package Lab1;
import java.util.Scanner;

public class Lab1_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.");
		int num1 = input.nextInt();
		
		if(num1 % 2 == 0)
			System.out.print("Even");
		else
			System.out.print("Odd");
		
		input.close(); 
	}
}
