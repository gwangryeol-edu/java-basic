package a.basic;

public class Variable {
    public static void main(String[] args) {
        // 작은 타입 → 큰 타입: 자동 변환
        int i = 100;
        long l = i;          // int → long
        float f = l;         // long → float
        double d = f;        // float → double

        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // char와 int
        char ch = 'A';
        int code = ch;       // char → int (ASCII 코드)
        System.out.println("문자 코드: " + code);  // 65

        // 큰 타입 → 작은 타입: 명시적 변환 필요
        double d2 = 3.14;
        int i2 = (int) d2;     // 소수점 이하 버림
        System.out.println("double: " + d2);
        System.out.println("int: " + i2);     // 3

        // 값 손실 가능성
        int largeNum = 1000;
        byte b = (byte) largeNum;
        System.out.println("byte: " + b);    // -24 (오버플로우)

        // 문자열을 숫자로
        String str = "123";
        int num = Integer.parseInt(str);
        double dNum = Double.parseDouble("3.14");
        System.out.println("문자열 → 정수: " + num);
        System.out.println("문자열 → 실수: " + dNum);

        // 참조형 타입
        // String(문자열 타입)
        String str2 = "hello";
        System.out.println(str2);

    }
}
