package Lab1;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		System.out.print("1.");
		int num1 = score.nextInt();
		System.out.print("2.");
		int num2 = score.nextInt();
		
		int sum = num1 + num2;
		
		System.out.print("รวมผลบวก = " + sum);
	}

}
