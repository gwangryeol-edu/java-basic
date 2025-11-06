package a.basic.pratice3;

public class P05_sum2thArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // 행의 길이 -> matrix.length
        // 열의 길이 -> matrix[i].length
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
