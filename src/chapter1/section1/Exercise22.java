package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise22 {
    public static int rank(int key, int[] arr, int lo, int hi, int depth)
    {


        for (int i  = 0; i < depth; i++)
            StdOut.print(" ");

        if (lo <= hi)
        {
            StdOut.print("lo: " + lo + ", hi: " + hi);
            StdOut.println();
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) return rank(key,arr,lo,mid-1, ++depth);
            else if (key > arr[mid]) return rank(key, arr, mid+1, hi, depth+1);
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,57, 89, 923, 1029, 10292};
        int key = 10293;
        Arrays.sort(arr);
        int index = rank(key,arr,0, arr.length-1, 0);
        StdOut.println();
        StdOut.println("Index: " + index);
    }
}
