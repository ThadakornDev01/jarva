package Lab1;
import java.util.Scanner;
public class Lab1_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int[] number = new int[size];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		int sum = 0;
			for(int i = 0; i < number.length; i++) {
				sum += number[i];
		}
		double average = (double) sum / size;
		
		System.out.print(average);
	}

}
