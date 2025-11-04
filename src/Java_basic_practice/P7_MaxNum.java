package Java_basic_practice;

public class P7_MaxNum {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 17;
        int max = a;

        if (b > max) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}
