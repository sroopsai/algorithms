package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {
    public static int[] histogram(int[] a, int M)
    {
        int[] hist = new int[M];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < M)
            {
                hist[a[i]] += 1;
            }

        }
        return hist;
    }
    public static void main(String[] args) {

        StdOut.println("Enter desired length of the array a: ");
        int length = StdIn.readInt();
        StdOut.println("Enter values for array a: ");
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = StdIn.readInt();
        }
        StdOut.println("Enter value of 'M' (length of the histogram)");
        int M = StdIn.readInt();
        StdOut.println("Calling the histogram function");
        int[] hist = histogram(a,M);
        int sum = 0;
        for (int i= 0; i < hist.length; i++)
        {
            StdOut.print(hist[i] + " ");
            sum += hist[i];
        }
        StdOut.println();
        StdOut.println(sum);
        StdOut.println(a.length);
    }
}
