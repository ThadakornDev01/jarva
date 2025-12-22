package Lab5;
import java.util.Scanner;

class Animal {
	protected String name;
	protected int age;
	
	public void displayinfo() {
		System.out.println("Name : " + name + ", Age :" + age);
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

public class Lab5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nameInput = sc.next();
		int ageInput = sc.nextInt();
		
		Dog myDog = new Dog();
		
		myDog.name = nameInput;
		myDog.age = ageInput;
		
		myDog.makeSound();
		myDog.displayinfo();

		sc.close();
	}

}
