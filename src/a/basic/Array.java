package a.basic;

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

    }
}