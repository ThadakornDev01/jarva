package Lab3;
import java.util.Scanner;

public class Lab3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		User user = new User(name);
		
		System.out.print(user.getUsername());
		
		scanner.close();
	}
	
}
class User {
	private String username;

	public User(String Uname){
		this.username = Uname;
	}

	public String getUsername(){
		return this.username;
	}
	
}