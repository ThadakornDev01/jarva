package Lab2;
import java.util.Scanner;
public class Lab2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		scanner.next();
		
		for(int i = 0; i < num; i++) {
			String id = scanner.nextLine();
			String name = scanner.nextLine();
			new Student3(id, name);
		}
		System.out.print(Student3.studentCount);
		scanner.close();
	}
}
class Student3{
	String StudentID;
	String Name;
	
	static int studentCount = 0;
	
	Student3(String id, String name){
		StudentID = id;
		Name = name;
		studentCount++;
	}
}
