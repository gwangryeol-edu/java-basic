package a.basic.pratice3;

public class P03_Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
