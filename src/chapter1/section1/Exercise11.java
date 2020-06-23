package chapter1.section1;


import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {
    public static void main(String[] args) {
        boolean[][] twoDArray = new boolean[5][5];
        /*
        * Filling the array randomly with values either false or true
         */
        StdOut.println("\t1\t2\t3\t4\t5");

        for (int i = 0; i < 5; i++) {
            StdOut.print(i + 1 + "\t");
            for (int j = 0; j < 5; j++) {

                if (Math.random() < 0.5) {
                    twoDArray[i][j] = false;
                    StdOut.print("\t");

                }
                else {
                    StdOut.print("*\t");
                }


            }
            StdOut.println();
        }
    }
}
