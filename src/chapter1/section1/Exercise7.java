package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise7 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("a) %.5f\n", t);
        int sum = 0;
        for (int i = 1; i < 1000; i++)

            for(int j = 0; j < i; j++)

                sum++;
        StdOut.println("b) "+ sum);
        sum = 0;
        for(int j = 1; j < 1000; j *= 2)
            for (int k = 0; k < 1000; k++)
                sum++;
        StdOut.println("c) " + sum);
    }
}
