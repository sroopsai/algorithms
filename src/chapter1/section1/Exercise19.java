package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
        public static long F(int N){
            if (N == 0) return 0;
            if (N == 1) return 1;
            return F(N-1) + F(N-2);
        }
        public static long betterF(int N)
        {
            if (N == 0) return 0;
            if (N == 1) return 1;
            long[] F = new long[N + 1];
            F[0] = 0;
            F[1] = 1;
            for (int i = 2 ; i < F.length; i++)
            {
                F[i] = F[i - 1] + F[i - 2];
            }
            return F[N];
        }

        public static void main(String[] args){
            for (int N = 0; N < 99; N++)
                StdOut.println(N + " " + betterF(N)); // after N = 92 the number overflows and the result is not right

        }
}

