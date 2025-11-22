package Lab1;
import java.util.Scanner;
public class Lab1_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int[] ID  = new int[size];
		int[] Stock = new int[size];
		
		for(int i = 0; i < ID.length; i++) {
			ID[i] = input.nextInt();
			Stock[i] = input.nextInt();
		}
		int SearchID = input.nextInt();
		int N = -1;
		
		for(int i = 0; i < ID.length; i++) {
			if(ID[i] == SearchID) {
				N = Stock[i];
				break;
			}
		}
		if (N != -1) {
			System.out.print(N);
		}else {
			System.out.print("Product [" + SearchID + "] not found" );
		}
	}
}
