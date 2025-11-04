package a.basic.practice2;

public class P08_GCD {
    // 최대공약수(Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지
            a = b;
            b = r;
        }
        return a; // a가 최대공약수
    }
    public static void main(String[] args) {
        int result = gcd(48, 18);
        System.out.println(result);
    }
}

//두 수 a, b의 최대공약수는
//“a를 b로 나눈 나머지 r”과 “b”의 최대공약수와 같다.
//즉,
//GCD(a, b) = GCD(b, a % b)