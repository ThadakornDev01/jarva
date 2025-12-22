package Lab5;
import java.util.Scanner;

class Animal2 {
	protected String name2;
	protected int age2;
	
	public void displayinfo() {
		System.out.println("Name : " + name2 + ", Age :" + age2);
	}
}

class Cat2 extends Animal2 {
	//@Override
	public void makeSound() {
		System.out.println("Meow !");
	}
}

public class Lab5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nameInport = sc.nextLine();
		int ageInport = sc.nextInt();

		Cat2 myCat = new Cat2();

		myCat.name2 = nameInport;
		myCat.age2 = ageInport;

		myCat.displayinfo();
		myCat.makeSound();
		
		sc.close();
	}

}
