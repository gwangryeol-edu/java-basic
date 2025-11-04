package a.basic.practice2;

public class P07_PrimeNumber2 {
    public static void main(String[] args) {
        int num = 16;
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false; // 0과 1은 소수 아님
        } else {

            // num이 소수가 아니라면, num = a × b로 표현 가능합니다.
            // 이때 a와 b 중 하나는 반드시 √num 이하입니다.
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }
}
