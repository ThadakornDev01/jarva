package Lab3;
import java.util.Scanner;

class User2 {
    private String password;

    public User2(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}
public class Lab3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String initialPass = scanner.nextLine();
        
        String newPass = scanner.nextLine();

        User2 user = new User2(initialPass);

        user.setPassword(newPass);

        System.out.println(user.getPassword());
        
        scanner.close();
	}
}
