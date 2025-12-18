package Lab4;
import java.util.Scanner;

class Configuration {
	private String theme;
	private int fontSize;
	private boolean darkMode;
	
	public Configuration(String theme,int fontSize,boolean darkMode) {
		this.theme = theme;
		this.darkMode = darkMode;
		
		if(fontSize < 10) {
			this.fontSize = 10;
		}else if(fontSize > 20){
			this.fontSize = 20;
		}else {
			this.fontSize = fontSize;
		}
	}
	
	public Configuration(Configuration base, Configuration user) {
		this.theme = user.theme;
		this.darkMode = user.darkMode;
    	this.fontSize = base.fontSize;
	}
	
	public void displaySettings() {
        System.out.println("Theme: [" + this.theme + "], Size: [" + this.fontSize + "], Dark: [" + this.darkMode + "]");
    }
}


public class Lab4_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String baseTheme = sc.next();
        int baseFont = sc.nextInt();
        boolean baseDark = sc.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseFont, baseDark);

        String userTheme = sc.next();
        int userFont = sc.nextInt();
        boolean userDark = sc.nextBoolean();

        Configuration userConfig = new Configuration(userTheme, userFont, userDark);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
    }
}