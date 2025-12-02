package Lab2;
import java.util.Scanner;
public class Lab2_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputId = scanner.nextLine();
		String inputName = scanner.nextLine();
		
		Student2 st = new Student2();
		st.studentId = inputId;
		st.name = inputName;
		
		st.displayInfo();
		scanner.close();
	}
}
class Student2{
	String studentId;
	String name;
	
void displayInfo() {
	System.out.println(studentId);
	System.out.println(name);
	}
}
	
