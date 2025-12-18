package Lab4;
import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } 
        else if (durationDays < 0) {
            this.durationDays = 0;
        } 
        else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newTotalDays = this.durationDays + days;

        if (newTotalDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newTotalDays);
    }

    public void displayInfo() {
        System.out.println("Plan: [" + planName + "], Days: [" + durationDays + "]");
    }
}

public class Lab4_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int maxPolicy = scanner.nextInt();
        Subscription.setMaxDuration(maxPolicy);

        String planName = scanner.next();
        int initialDays = scanner.nextInt();
        Subscription sub = new Subscription(planName, initialDays);

        int extendDays1 = scanner.nextInt();
        sub = sub.extend(extendDays1);

        int extendDays2 = scanner.nextInt();
        sub = sub.extend(extendDays2);

        sub.displayInfo();
    }
}
