package a.basic.pratice3;

import java.util.Arrays;

public class P02_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] r_arr = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            r_arr[i] = arr[(arr.length-1)-i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(r_arr));
    }
}
