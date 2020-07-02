package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {
    public static int gcd(int p, int q)
    {
        if (q==0) {
            StdOut.println(p + " " + q);
            return p;
        }
        else {
            StdOut.println(p + ", " + q);
            StdOut.println();
            return gcd(q, p % q);
        }
    }

    public static void main(String[] args) {
        gcd(1234567,1111111);
    }
}
