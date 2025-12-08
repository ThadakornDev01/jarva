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
		
		User user = new User(inputName); //ส่ง inputName เข้าไปใน Constructor ของ User
		System.out.print(user.getUsername()); //แสดงผลชื่อผู้ใช้ โดยการเรียกใช้เมธอด getUsername()
		
		scanner.close();
	}
}
