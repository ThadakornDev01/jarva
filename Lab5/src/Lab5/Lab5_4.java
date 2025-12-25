package Lab5;
import java.util.Scanner;

class Vehicle {
	protected String color;
	
	public Vehicle(String color) {
		this.color = color;
	}
}

class Car2 extends Vehicle {
	protected int wheels;
	
	public Car2(String color,int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.print("Color :" + color + ", Wheels :" + wheels);
	}
}


public class Lab5_4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String intColor = sc.nextLine();
	int intWheels = sc.nextInt();
	
	Car2 car = new Car2(intColor, intWheels);
	car.displayDetails();
	sc.close();
	}
}
