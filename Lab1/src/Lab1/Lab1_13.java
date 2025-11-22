package Lab1;
import java.util.Scanner;
public class Lab1_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int R = input.nextInt();
		int C = input.nextInt();
		
		int[][] Array = new int[R][C];
		
		for(int i = 0; i < R; i++) {
			for(int p = 0; p < C; p++) {
				Array[i][p] = input.nextInt();
			}
		}
		int No = 0;
		for(int i = 0; i < R; i++) {
			for(int p = 0; p < C; p++) {
				if(Array[i][p] == 1) {
					No++;
				}
			}
		}
		System.out.println(No);
		input.close();
	}
}
