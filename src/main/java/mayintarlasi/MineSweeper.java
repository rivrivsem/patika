package mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();


        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
               grid[i][j]=-1;
            }
        }
        boolean[][] mines = new boolean[rows][cols];
        int mineCount = (rows * cols) / 4;

        for (int i = 0; i < mineCount; i++)
        {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);
            mines[row][col] = true;
        }


        System.out.println("Welcome to Minesweeper!");
        printGrid(grid);

        while (true) {

            System.out.print("Enter a row: ");
            int row = scanner.nextInt() - 1;
            System.out.print("Enter a column: ");
            int col = scanner.nextInt() - 1;


            if (row < 0 || row >= rows || col < 0 || col >= cols)
            {
                System.out.println("Invalid selection. Please try again.");
                continue;
            }


            if (mines[row][col])
            {
                System.out.println("Game Over!");
                break;
            }
            else
            {
                int mineCountAround = 0;
                for (int i = Math.max(row - 1, 0); i <= Math.min(row + 1, rows - 1); i++)
                {
                    for (int j = Math.max(col - 1, 0); j <= Math.min(col + 1, cols - 1); j++)
                    {
                        if (mines[i][j])
                        {
                            mineCountAround++;
                        }
                    }
                }
                grid[row][col] = mineCountAround;
                printGrid(grid);
            }


            boolean won = true;
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if (grid[i][j] == -1 && !mines[i][j])
                    {
                        won = false;
                        break;
                    }
                }
                if (!won)
                {
                    break;
                }
            }
            if (won)
            {
                System.out.println("You won!");
                break;
            }
        }
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                if (grid[i][j] == -1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
