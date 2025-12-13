package Lab4;
import java.util.Scanner;

class Player1{
	private String username;
	private int level;
	
	public Player1() {
		this.username = "Guest";
		this.level = 1;
	}
	
	public Player1(String username, int livel) {
		this.username = username;
		this.level = livel;
	}
	
	public void dislayplayProfile() {
		System.out.println("User : " + username + ", Level : " + level);
	}
}

public class Lab4_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mode = scanner.nextInt();
		scanner.nextLine();
		
		Player1 player1 = null;
		
		if(mode == 1) {
			player1 = new Player1();
		}else if (mode == 2) {
			String username = scanner.nextLine();
			int livel = scanner.nextInt();
			player1 = new Player1(username, livel);
		}
		
		if (player1 != null) {
			player1.dislayplayProfile();
		}
		scanner.close();
	}

}
