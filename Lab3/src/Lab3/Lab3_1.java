package Lab3;
import java.util.Scanner;

class User {
	private String username;

	User(String username){
		this.username = username;
	}

	public String getUsername(){
		return this.username;
	}
}

public class Lab3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputName = scanner.nextLine();
		
		//ส่ง inputName เข้าไปใน Constructor ของ User
		User user = new User(inputName);

		//แสดงผลชื่อผู้ใช้ โดยการเรียกใช้เมธอด getUsername()
		System.out.print(user.getUsername());
		
		scanner.close();
	}
}