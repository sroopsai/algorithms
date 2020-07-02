package chapter1.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
/*
Download the text files using the commands
% wget https://algs4.cs.princeton.edu/11model/largeText.txt
% wget https://algs4.cs.princeton.edu/11model/largeAllowList.txt
Compilation: javac-algs4 Exercise23.java

Run: java-algs4 chapter1/section1/Exercise23 chapter1/section1/largeAllowlist.txt + < chapter1/section1/largeText.txt
To check which keys are not in the largeAllowList but in largeText
Run: java-algs4 chapter1/section1/Exercise23 chapter1/section1/largeAllowlist.txt - < chapter1/section1/largeText.txt > chapter1/section1/notInAllowList.txt
To check which keys in the largeAllowlist and in largeText

 */

public class Exercise23 {
    public static int rank(int key, int[] a, int lo, int hi)
    {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if (key < a[mid]) return rank(key, a, lo, mid -1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        String option = args[1];
        int[] whiteList = in.readAllInts();
        Arrays.sort(whiteList);
        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if (option.equals("+") && rank(key, whiteList, 0, whiteList.length - 1) == -1) StdOut.println(key);
            else if (option.equals("-") && rank(key, whiteList, 0, whiteList.length - 1) != -1) StdOut.println(key);
        }
    }
}
