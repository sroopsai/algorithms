package chapter1.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise21 {
    public static void main(String[] args) {
        In in = new In();
        StdOut.printf("%s\t%s\t%s\t%s\n", "Name", "Value1", "Value2", "Average");
        while (in.hasNextLine())
        {
            String input = in.readLine();
            String[] values = input.split(" ");
            double average = (Integer.parseInt(values[1]) + Integer.parseInt(values[2]))/2;
            StdOut.printf("%s\t%d\t\t%d\t\t%.3f\n", values[0], Integer.parseInt(values[1]),
                    Integer.parseInt(values[2]), average);

        }


    }
}
