package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {
    public static int mystery(int a, int b){
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    public static int mystery2(int a, int b){
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        StdOut.print(mystery(2,25) + " " + mystery(3, 11) + "\n"); // ans: 50 33
        StdOut.print(mystery2(2, 25) + " " + mystery2(3, 11)); // ans: 96 135

    }
}
