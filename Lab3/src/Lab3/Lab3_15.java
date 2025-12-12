package Lab3;
import java.util.Scanner;

class User6 {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User6(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            this.failedAttempts = 0;
            System.out.println("Login successful.");
        } 
        else {
            this.failedAttempts++;
            
            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int remaining = maxAttempts - this.failedAttempts;
                System.out.println("Login failed. " + remaining + " attempts left.");
            }
        }
    }
}

public class Lab3_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            String username = sc.next();
            User6 user6 = new User6(username);

            if (sc.hasNextInt()) {
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    String command = sc.next();

                    if (command.equals("SET_POLICY")) {
                        int newMax = sc.nextInt();
                        User6.setPolicy(newMax);

                    } else if (command.equals("LOGIN")) {
                        String password = sc.next();
                        user6.login(password);
                    }
                }
            }
        }
        sc.close();
	}

}
