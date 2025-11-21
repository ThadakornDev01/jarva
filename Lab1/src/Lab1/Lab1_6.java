package Lab1;
import java.util.Scanner;
public class Lab1_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numint = input.nextInt();
		
		for (int Num = 1; Num < 13 ; Num++) {
			int sum = numint * Num;
			System.out.print(numint);
			System.out.print(" X ");
			System.out.print(Num);
			System.out.print(" = ");
			System.out.println(sum);
		}
		
		input.close(); 

	}

}
