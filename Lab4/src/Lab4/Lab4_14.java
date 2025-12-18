package Lab4;
import java.util.Scanner;
import java.util.Arrays;

class ScoreBoard {
    private String gameName;
    private int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores; 
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;

        if (other.scores != null) {
            this.scores = new int[other.scores.length];
            for (int i = 0; i < other.scores.length; i++) {
                this.scores[i] = other.scores[i];
            }
        }
    }

    public void displayScores() {
        System.out.print(this.gameName + ": ");
        if (this.scores != null) {
            for (int i = 0; i < this.scores.length; i++) {
                System.out.print(this.scores[i]);
                if (i < this.scores.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}

public class Lab4_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String gameName = scanner.nextLine();

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        
        int modifyValue = scanner.nextInt();

        int[] originalScores = {s1, s2, s3};

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);

        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = modifyValue;

        sb1.displayScores();
        sb2.displayScores();
	}

}
