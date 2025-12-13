package Lab4;
import java.util.Scanner;

class Color1 {
	private int red;
	private int green;
	private int blue;
	
	public Color1(int r, int g, int b) {
		if(r < 0) {
			this.red = 0;
		}else if (r > 255) {
			this.red = 255;
		}else {
			this.red = r;
		}
		
		if(g < 0) {
			this.green = 0;
		}else if (g > 255) {
			this.green = 255;
		}else {
			this.green = g;
		}
		
		if(b < 0) {
			this.blue = 0;
		}else if (b > 255) {
			this.blue = 255;
		}else {
			this.blue = b;
		}	
	}
	
	public int getRed() {
		return 0;
	}
	
	public int getGreen() {
		return 0;
	}
	
	public int getblue() {
		return 0;
	}
	
	public void displayRGB() {
		System.out.println("R = " + red + ", G = " + green + ", B =" + blue);
	}
}

public class Lab4_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();
		
		Color1 color = new Color1(r, g, b);
		color.displayRGB();
		
		scanner.close();
	}

}
