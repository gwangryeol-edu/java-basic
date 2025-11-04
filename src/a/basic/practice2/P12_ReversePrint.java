package a.basic.practice2;

public class P12_ReversePrint {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;         // 마지막 자리 추출 (5 → 4 → 3 → 2 → 1)
            reverse = reverse * 10 + digit; // 뒤집어서 누적
            num /= 10;                     // 마지막 자리 제거
        }

        System.out.println(reverse);
    }
}
