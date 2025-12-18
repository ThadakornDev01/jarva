package Lab4;
import java.util.Scanner;
import java.util.Arrays;

class AuditRecord {
    private final String user;
    private final String[] logMessages;

    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;

        int size = logs.length;
        int start = 0;

        if (size > maxMessages) {
            start = size - maxMessages;
            size = maxMessages;
        }

        this.logMessages = new String[size];
        for (int i = 0; i < size; i++) {
            this.logMessages[i] = logs[start + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (this.logMessages.length >= maxMessages) {
            System.out.println("Log is full.");
            return this;
        }

        String[] newLogs = new String[this.logMessages.length + 1];

        for (int i = 0; i < this.logMessages.length; i++) {
            newLogs[i] = this.logMessages[i];
        }

        newLogs[newLogs.length - 1] = message;

        return new AuditRecord(this.user, newLogs);
    }

    public void displayLog() {
        System.out.println("User: " + this.user + ", Logs: " + this.logMessages.length + " " + Arrays.toString(this.logMessages));
    }
}


public class Lab4_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    int initialMax = scanner.nextInt();
	    AuditRecord.setPolicy(initialMax);

	    String user = scanner.next();
	    AuditRecord rec = new AuditRecord(user);

	    int n = scanner.nextInt();

	    for (int i = 0; i < n; i++) {
	        String input = scanner.next();

	        if (input.equals("SET_POLICY")) {
	            int newMax = scanner.nextInt();
	            AuditRecord.setPolicy(newMax);
	        } else {
	            AuditRecord newRec = rec.addMessage(input);

	            if (newRec != rec) {
	                System.out.println(input + " added.");
	                rec = newRec;
	            }
	        }
	    }
	    rec.displayLog();
	}
}
