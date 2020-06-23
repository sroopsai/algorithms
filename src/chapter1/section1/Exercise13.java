package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {
        StdOut.print("Enter # rows: ");
        int M = StdIn.readInt();
        StdOut.print("Enter # columns: ");
        int N = StdIn.readInt();
        int[][] matrix = new int[M][N];
        StdOut.println("Enter Values for matrix M (3x2 matrix)");
        for (int i  = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                matrix[i][j] = StdIn.readInt();
            }
        }
        StdOut.println("\n*****Original Matrix*****");
        for (int i = 0 ; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                StdOut.print(matrix[i][j] + " ");
            }
            StdOut.println();
        }

        int[][] transpose = new int[N][M];
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        StdOut.println("\n*****Transposed Matrix*****");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                StdOut.print(transpose[i][j] + " ");
            }
            StdOut.println();
        }

    }

}
