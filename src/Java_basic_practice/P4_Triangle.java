package Java_basic_practice;

import java.util.Scanner;

public class P4_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean triangle = true;

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int sum = a + b + c;

        if(max >= sum -max) {
            triangle = false;
            System.out.println(triangle);
        } else {
            triangle = true;
            System.out.println(triangle);
        }
    }
}

// 3
// 4
// 5
// true