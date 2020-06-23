package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
    public static int lg(int N)
    {
        int lgN = 0;
        while (N > 0)
        {
            lgN += 1;
            N /= 2;
        }
        return lgN - 1;
    }
    public static void main(String[] args) {
        StdOut.print("Enter N value to find lg(N): ");
        int N = StdIn.readInt();
        StdOut.printf("lg(%d) = %d", N , lg(N));
    }
}
