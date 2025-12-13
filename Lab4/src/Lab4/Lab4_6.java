package Lab4;
import java.util.Scanner;

class Point1 {
	private final int x ;
	private final int y ;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return 0;
	}
	
	public int getY() {
		return 0;
	}
	
	public Point1 move(int dx, int dy) {
		int newX = this.x + dx;
		int newY = this.y + dy;
		
		return new Point1(newX, newY);
	}
	
	public void displsyInfo() {
		System.out.println("(" + x + "," + y + ")");
	}
}


public class Lab4_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int startX = scanner.nextInt();
		int startY = scanner.nextInt();
		
		int dx = scanner.nextInt();
		int dy = scanner.nextInt();
		
		Point1 p1 = new Point1(startX, startY);
		
		Point1 p2 = p1.move(dx, dy);
		
		Point1 p3 = p2.move(dx, dy);
		
		p1.displsyInfo();
		p2.displsyInfo();
		p3.displsyInfo();
		
		scanner.close();
	}

}
