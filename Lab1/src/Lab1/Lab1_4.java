package Lab1;
import java.util.Scanner;
public class Lab1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		if(num1 >= 80)
			System.out.print("A+++++++++++++++++++++++++");
		else if (num1 >= 70)
			System.out.print("B");
		else if (num1 >= 60)
			System.out.print("C");
		else if (num1 >= 50)
			System.out.print("D");
		else 
			System.out.print("F");
		
		input.close(); 
	}

}
