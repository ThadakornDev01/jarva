package Lab3;
import java.util.Scanner;

class Player{
	private int score;
	
	//Constructor รับค่าเริ่มต้น
	Player(int score){
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int newScore) {
		this.score = newScore;
	}
}
public class Lab3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int initialScore = scanner.nextInt();
		
		int updatedScore = scanner.nextInt();
		
		
		Player Py = new Player(initialScore);
		
		//เรียกใช้เมธอด setScore() เพื่ออัปเดตคะแนน
		Py.setScore(updatedScore);
		System.out.println(Py.getScore());
		
		
		scanner.close();
	}
}
