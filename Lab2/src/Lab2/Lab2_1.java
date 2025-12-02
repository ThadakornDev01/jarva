package Lab2;
import java.util.Scanner;
public class Lab2_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputId = scanner.nextLine();
		String inputName = scanner.nextLine();
		
		Student st = new Student();
		st.StudentId = inputId;
		st.name = inputName;
		
		System.out.println(st.StudentId);
		System.out.println(st.name);
		
		scanner.close();
	}
}
class Student{
	String StudentId;
	String name;
}