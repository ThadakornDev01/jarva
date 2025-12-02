package Lab2;
import java.util.Scanner;
public class Lab2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputName = scanner.nextLine();
		int inputMin = scanner.nextInt();
		int inputFinal = scanner.nextInt();
		
		Student4 st = new Student4(inputName, inputMin, inputFinal);
		st.diplay();
	}
}

class Student4{
	String name;
	int midtermScore;
	int finalScore;
	
	Student4(String n, int mid, int fin) {
		name = n;
		midtermScore = mid;
		finalScore = fin;
	}
	
	double gpa() {
		return (midtermScore + finalScore) / 2.0;
	}
	
	void diplay() {
		double avg = gpa();
		
		System.out.println("Name: " + name);
		System.out.println("Average Score: " + avg);
		
		if (avg > 50) {
			System.out.println("Status: Pass");			
		}else {
			System.out.print("Status: Fail");
		}
	}
	
}