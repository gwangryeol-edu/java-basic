package c.oop2;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    String printValue(int score) {
        if (score >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }

    int[] getArray() {
        return new int[]{1, 3, 5, 7, 9};
    }

    void printResult(int result) {
        System.out.println(result);
    }
}

