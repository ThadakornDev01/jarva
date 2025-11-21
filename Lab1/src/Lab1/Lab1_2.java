package Lab1;
import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.");	
		double num1 = input.nextInt();		//กรอกค่าที่ต้องการคเอาไปคูน ตัวที่ 1
		System.out.print("2.");
		double num2 = input.nextInt();		//กรอกค่าที่ต้องการคเอาไปคูน ตัวที่ 2
		
		double sum = num1 * num2;
		
		System.out.print("ผลการคูน = " + sum);
		
	}		//double ใช้แสดงทศนิยม
}
