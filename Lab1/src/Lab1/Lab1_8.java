package Lab1;
import java.util.Scanner;
public class Lab1_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int[] number = new int[size];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.print(max);
	}

}
