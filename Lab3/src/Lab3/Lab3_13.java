package Lab3;
import java.util.Scanner;

class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
            return;
        }

        if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
            return;
        }

        maxLicenses = max;
        System.out.println("Max licenses set to " + max);
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class Lab3_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String command = sc.next();

                if (command.equals("SET")) {
                    int max = sc.nextInt();
                    LicenseManager.setMax(max);

                } else if (command.equals("CHECKOUT")) {
                    LicenseManager.checkOut();

                } else if (command.equals("CHECKIN")) {
                    LicenseManager.checkIn();

                } else if (command.equals("STATUS")) {
                    LicenseManager.displayStatus();
                }
            }
        }
        sc.close();
    }
}
