package Lab5;
import java.util.Scanner;

class Employee {
	protected double salary;
	
	public double calculateBonus() {
		return salary * 0.10;
	}
}

class Manager extends Employee {
	@Override
	public double calculateBonus() {
		double NewBonud = super.calculateBonus();
		return NewBonud + (salary * 0.05);
	}
}

public class Lab5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double intSalary = sc.nextDouble();
		
		Manager mgr = new Manager();
		
		mgr.salary = intSalary;
		
		System.out.print(mgr.calculateBonus());
		
		sc.close();
	}

}
