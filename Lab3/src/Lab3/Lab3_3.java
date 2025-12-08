package Lab3;
import java.util.Scanner;

class User2{
	private String password;
			
	User2(String password){
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String newPassword) {
		if (newPassword.length() >= 8) {  //.length คือการตรวจคำ
			this.password = newPassword;
			System.out.println("Password updated");
		}
		else {
			System.out.println("Password is too short.");
		}
	}
}
public class Lab3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String initialPassword = scanner.nextLine();	//รับรหัสผ่านเริ่มต้น
		String updatedPassword = scanner.nextLine();	//รับรหัสผ่านใหม่ที่ต้องการเปลี่ยน
		
		User2 user = new User2(initialPassword); //สร้าง Object User ด้วยรหัสผ่านเริ่มต้น
		user.setPassword(updatedPassword); //เรียก setPassword
		System.out.println(user.getPassword());
		
		scanner.close();
	}
}
