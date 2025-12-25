package Lab5;
import java.util.Scanner;

class Shape {
	protected String name2;
	
	public Shape(String name2) {
		this.name2 = name2;
	}
	
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	protected double radius;
	
	public Circle(String name2, double radius) {
		super(name2);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * 3.14159;
	}
}

class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle(String name2, double width, double height) {
		super(name2);
		
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}

public class Lab5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double R =sc.nextDouble();
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        
        Circle C = new Circle("Circle", R);
        
        Rectangle rect = new Rectangle("Rectangle", W, H);

        Shape[] shapes = {C, rect};
        
        for (Shape s : shapes) {
            System.out.println(s.name2 + " area: " + s.calculateArea());
        }
        
        sc.close();
	}

}
