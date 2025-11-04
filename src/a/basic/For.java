package a.basic;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------");

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: "+i);
            System.out.println("j: "+j);
        }

        for (int i = 2; i < 10; i++) {
            System.out.println();
            System.out.println("####### " + i + "단 ########");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }

        // enhanced for
        int[] numbers = {10, 20, 30, 40, 50};

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
