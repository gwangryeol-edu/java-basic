package a.basic.pratice3;

import java.util.Arrays;

public class P06_2thLarge {
    public static void main(String[] args) {
        int[] arr = {45, 23, 78, 12, 89, 34};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);

    }
}
