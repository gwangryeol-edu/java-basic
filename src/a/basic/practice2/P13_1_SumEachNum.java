package a.basic.practice2;

public class P13_1_SumEachNum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 12345;
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i);
            // 문자를 반환
            // 예를 들면 '1'은 숫자 1이 아니라 문자 코드 49
        }
        for(int i = 0; i<arr.length; i++){
            sum += arr[i] - '0';    // 문자를 숫자로 변환
        }
        System.out.println(sum);
    }
}
