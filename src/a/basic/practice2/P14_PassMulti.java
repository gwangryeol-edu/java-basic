package a.basic.practice2;

public class P14_PassMulti {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("######### " + i + "단 출력 #########");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }

        }
    }
}
