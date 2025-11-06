package a.basic.pratice3;

import java.util.Arrays;

public class P01_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 78, 12, 89, 34};

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println(max);
        System.out.println(min);
    }
}

// Arrays.stream(numbers) : numbers 배열을 Stream 형태로 변환
// .max() / .min() : 최대/최소
// .getAsInt() : 제 값이 존재할 때 일반 int 형태로 반환
// Stream : 데이터의 흐름을 객체 형태로 표현 -> 데이터를 연속적인 흐름으로 처리하는 api