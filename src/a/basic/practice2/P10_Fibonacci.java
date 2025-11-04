package a.basic.practice2;

public class P10_Fibonacci {
    public static int recursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;  // 원하는 피보나치 수열의 항 개수

        System.out.print(recursive(n-1));

    }
}
