package chapter1.section1;

public class Exercise16 {
    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    public static void main(String[] args) {
        String result = exR1(6);
        System.out.println(result); // result = 311361142246

    }
}
