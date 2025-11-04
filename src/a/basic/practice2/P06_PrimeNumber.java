package a.basic.practice2;

public class P06_PrimeNumber {
    public static void main(String[] args) {
        int num = 16;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + "은 소수 입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");

        }
    }
}
