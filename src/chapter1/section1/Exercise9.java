package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
    public static void main(String[] args) {
        /*
        Binary representation of an Integer
         */
        int N = StdIn.readInt();
        String binary = "";
        for(int n  = N; n > 0; n /= 2 )
            binary = (n % 2) + binary;
        StdOut.println(binary);
    }
}
