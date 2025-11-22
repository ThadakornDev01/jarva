package Lab1;
import java.util.Scanner;
public class Lab1_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int[] number = new int[size];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		
		int total = sumArray(number);
		System.out.print(total);
		
	}
	public static int sumArray (int intnumber[]) {
		int sum = 0;
		for (int i = 0; i < intnumber.length; i++) {
			sum += intnumber[i];
		}
		return (sum);
	}
}
