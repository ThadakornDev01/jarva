package Lab3;
import java.util.Scanner;

class SystemConfig {
	private static SystemConfig instance;
	
	private String serverUrl;
	private int maxConnections;
	
	private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }
	
	public static SystemConfig getInstance() {
		if (instance == null ) {
            instance = new SystemConfig();
        }
		return instance;
	}
	
	public String getServerUrl(){
		return this.serverUrl;
	}
	
	public int getMaxConnections() {
        return this.maxConnections;
    }
	
	public void setServerUrl(String url) {
        this.serverUrl = url;
    }
	
	public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab3_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String command = sc.next();

                if (command.equals("SET_URL")) {
                    String newUrl = sc.next();
                    SystemConfig.getInstance().setServerUrl(newUrl);

                } else if (command.equals("SET_MAX")) {
                    int newMax = sc.nextInt();
                    SystemConfig.getInstance().setMaxConnections(newMax);

                } else if (command.equals("SHOW")) {
                    SystemConfig config = SystemConfig.getInstance();
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                }
            }
        }
        sc.close();
    }

}
