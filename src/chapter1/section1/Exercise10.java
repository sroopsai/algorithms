package chapter1.section1;

public class Exercise10 {
    public static void main(String[] args) {
        int[] a; // Leads to variable a might not have been initialized compile-time error.
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
    }
}
