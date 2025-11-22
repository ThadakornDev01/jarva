package Lab1;
import java.util.Scanner;
public class Lab1_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int R = input.nextInt();
        int C = input.nextInt();

        char[][] map = new char[R][C];

        // 2. รับค่าตารางแผนที่ทีละตัว (ไม่ต้อง split)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = input.next().charAt(0); // '*' หรือ '.'
            }
        }

        // 3. รับพิกัดเป้าหมาย
        int targetR = input.nextInt();
        int targetC = input.nextInt();

        // 4. ตรวจสอบผลลัพธ์
        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int count = 0;
            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int k = 0; k < 8; k++) {
                int newR = targetR + dx[k];
                int newC = targetC + dy[k];

                if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                    if (map[newR][newC] == '*') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        input.close();
    }
}