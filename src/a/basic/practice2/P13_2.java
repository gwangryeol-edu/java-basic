package a.basic.practice2;

public class P13_2 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
