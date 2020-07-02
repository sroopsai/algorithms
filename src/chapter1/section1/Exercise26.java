package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise26 {
    // Estimate the # recursive calls
    public static int calls = 0;
    public static double binomial(int N, int k, double p)
    {
        calls += 1;

        if ((N == 0) && (k == 0)) return 1.0;
        if ((N  < 0) || (k  < 0)) return 0.0;
        return (1 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

    public static void main(String[] args) {
        binomial(3, 2, 0.25);
        StdOut.println(calls);
    }
}
