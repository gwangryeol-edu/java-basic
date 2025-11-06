package a.basic;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // 배열 선언, 크기 지정
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        System.out.println(numbers.length);
        System.out.println(numbers[4]);

        // 배열 초기화
        // 선언 후 한칸씩 할당
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 선언과 동시에 초기화
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr2[1]);

        // 생략
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(arr3[2]);

        String[] names = {"kim", "lee", "park"};
        System.out.println(names.length);

        int[] scores = {80, 90, 40, 50, 60};

        // index 접근
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 향상된 for문
        // 요소반복
        for (int score : scores) {
            System.out.println(score);
        }


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix.length);
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][2]);
        System.out.println();
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();
        // Array 유틸리티 클래스
        int[] nums = {4, 6, 12, 7, 2, 46};
        System.out.println(Arrays.toString(nums));  // import java.util.Arrays;

        Arrays.sort(nums);  // nums 배열을 오른차순으로 정렬
        System.out.println(Arrays.toString(nums));

        int idx = Arrays.binarySearch(nums, 2); // 정렬(sort)이 되어 있어야 가능, 없으면 음수
        System.out.println(idx);

        int[] filled = new int[10];
        Arrays.fill(filled, 99);
        System.out.println(Arrays.toString(filled));

        int[] origin = {1, 2, 3, 4, 5};
        int[] copied = Arrays.copyOf(origin, origin.length);    // (복사할 배열, 얼마큰 복사할 건지(배열의 길이만큼))
        System.out.println(Arrays.toString(copied));

        int[] copied2 = origin;
        System.out.println(Arrays.toString(copied2));
        System.out.println();

        origin[0] = 100;
        System.out.println(Arrays.toString(origin));    // 원본        [100, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copied));    // 원본 복사    [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copied2));   // 주소 복사    [100, 2, 3, 4, 5]

        int[] ranged = Arrays.copyOfRange(origin, 1, 3);
        System.out.println(Arrays.toString(ranged));    // [2, 3]

        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};
        System.out.println(arrA == arrB);
        System.out.println(Arrays.equals(arrA, arrB));

        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.toString(mat));       // toString
        System.out.println(Arrays.deepToString(mat));   // deepToString

        // origin[99] = 100; // out of bounds
        // 가변형 배열 ArrayList 로 해결
    }
}