package Lab1;
import java.util.Scanner;
public class Lab1_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double width = input.nextDouble();
		double height = input.nextDouble();
		double sums = calculateArea(width, height);
		System.out.print(sums);
	}
	
	public static double calculateArea (double width, double height) {
		double sum = width * height;
		return (sum);
	}

}
