package Lab3;
import java.util.Scanner;

class DatabaseConnection{
	private String connectionString;
    private boolean connected;
    
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false; 
    }
    
    public boolean isConnected() {
        return this.connected;
    }
    
    public void connect() {
        if (this.connected == false) {
            this.connected = true;
            System.out.println("Connected to " + this.connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }
    
    public void disconnect() {
        if (this.connected == true) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Lab3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputConnectionString = scanner.nextLine();

        DatabaseConnection db = new DatabaseConnection(inputConnectionString);

        db.connect();
        db.disconnect();
        db.disconnect();

        System.out.println(db.isConnected());
        
        scanner.close();
	}

}
