package a.basic.practice2;

public class P09_LCM {
    // GCD(최대공약수)를 먼저 구한 뒤, 두 수의 곱을 GCD로 나누면 됩니다.

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int resultGcd = gcd(a, b);
        int resultLcm = lcm(a, b);

        System.out.println("최대공약수(GCD): " + resultGcd);
        System.out.println("최소공배수(LCM): " + resultLcm);
    }
}
