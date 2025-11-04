package a.basic.practice1;

import java.util.Scanner;

public class P6_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in [cm]");
        double height = sc.nextDouble();
        System.out.println("Enter your weight in [kg]");
        double weight = sc.nextDouble();

        double bmi = weight/ (height/100 * height/100);

        System.out.printf("bmi : %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }

}
