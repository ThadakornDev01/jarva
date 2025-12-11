package Lab3;
import java.util.Scanner;

class User5 {
	private String username;
	private String password;
	
	private static int minPasswordLength = 8;
	
	public User5(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }
	
	public String getPassword() {
        return this.password;
    }
	
	public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }
	
	public static void setMinLength(int length) {
		if(length < 4) {
			System.out.print("lnstance length");
		}else {
			minPasswordLength = length;
            System.out.println("New min length set to " + length);
		}
	}
	
	public static int getMinLength() {
        return minPasswordLength;
    }
}

public class Lab3_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int minLength1 = Integer.parseInt(scanner.nextLine());

        String user1_name = scanner.nextLine();

        String user1_pass = scanner.nextLine();

        String user2_name = scanner.nextLine();

        String user2_pass = scanner.nextLine();

        int minLength2 = Integer.parseInt(scanner.nextLine());

        String user2_newPass = scanner.nextLine();

        User5.setMinLength(minLength1);

        User5 u1 = new User5(user1_name, user1_pass);

        User5 u2 = new User5(user2_name, user2_pass);

        User5.setMinLength(minLength2);

        u2.setPassword(user2_newPass);

        System.out.println(u1.getPassword());
        System.out.println(u2.getPassword());
        
        scanner.close();
	}

}
