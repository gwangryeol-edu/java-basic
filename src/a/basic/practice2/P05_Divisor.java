package a.basic.practice2;

public class P05_Divisor {
    public static void main(String[] args) {
        int num = 24;

        System.out.print(num+"의 약수는 : ");
        for (int i = 1; i <= num; i++) {
            if (24 % i == 0) {

                System.out.print(i + " ");
            }
        }
    }
}
