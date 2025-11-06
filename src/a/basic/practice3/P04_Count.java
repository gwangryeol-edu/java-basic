package a.basic.pratice3;

public class P04_Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        boolean[] visit = new boolean[arr.length];  // 방문 여부

        for (int i = 0; i<arr.length; i++) {
            // 이미 센 숫자 건너 뛰기
            if (visit[i] == true) {
                continue;
            }
            int count = 0;

            for (int j = i; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visit[j] = true;
                }
            }
            System.out.println(count);
        }
    }
}

/* 더 효율적인 방법

int[] arr = {1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 1, 1, 10, 99};

// 1️⃣ 최대값 찾기
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}

// 2️⃣ 카운트 배열 생성 (크기 = max + 1)
int[] count = new int[max + 1];

// 3️⃣ 개수 세기
for (int num : arr) {
    count[num]++;
}

System.out.println(Arrays.toString(count));
*/