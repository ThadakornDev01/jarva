package Lab1;
import java.util.Scanner;
public class Lab1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row;
        while (true) {
            System.out.print("Input Row: ");
            String inputRow = sc.nextLine();
            try {
                 row = Integer.parseInt(inputRow);
                 break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        int col;
        while (true) {
            System.out.print("Input Col: ");
            String inputCol = sc.nextLine();
            try {
                 col = Integer.parseInt(inputCol);
                 break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        char[][] minefield = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                while (true) {
                    System.out.print("Enter '*' for mine or '.' for empty cell: ");
                    char input = sc.next().charAt(0);
                    if (input == '*' || input == '.') {
                        minefield[i][j] = input;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter '*' or '.'");
                    }
                }
            }
        }

        System.out.println("\nMinefield:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(minefield[i][j] + " ");
            }
            System.out.println();
        }

        int rowSelect;
        while (true){
            System.out.print("Input position (Row): ");
            String inputRowSelect = sc.nextLine();
            try {
                 rowSelect = Integer.parseInt(inputRowSelect);
                 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if(rowSelect < 0 || rowSelect >= row){
                System.out.println("Row out of bounds. Please enter a valid row.");
                continue;
            }

            break;
        }

        int colSelect;
        while (true){
            System.out.print("Input position (Col): ");
            String inputColSelect = sc.nextLine();
            try {
                 colSelect = Integer.parseInt(inputColSelect);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if(colSelect < 0 || colSelect >= col){
                System.out.println("Col out of bounds. Please enter a valid column.");
                continue;
            }

            break;
        }

        char selectedCell = minefield[rowSelect][colSelect];

        if (selectedCell == '*') {
            System.out.println("Boom! You hit a mine!");
        } else {
            int mineCount = 0;

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newRow = rowSelect + i;
                    int newCol = colSelect + j;

                    if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col) {
                        if (minefield[newRow][newCol] == '*') {
                            mineCount++;
                        }
                    }
                }
            }

            System.out.println("Safe! There are " + mineCount + " mines around.");
        }

        sc.close();
    }
}
