public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int x = 10;
        int y = 3;

        double result = (double) x / y;
        System.out.println(result);

        int intc = 123456;
        System.out.println(intc << 1); // 왼쪽 시프트 = * 2
        System.out.println(intc >> 1); // 오른쪽 시프트 = / 2
    }
}
