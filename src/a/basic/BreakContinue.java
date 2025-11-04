package a.basic;

public class BreakContinue {
    public static void main(String[] args) {

        // break
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        System.out.println("--------------------------------");
        // continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 레이블 없음 - 내부 반복만 종료
        System.out.println("--------------------------------");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
                if (i > 4) {
                    break;
                }
            }
        }
//        4*9=36
//        5*1=5
//        6*1=6
//        7*1=7
//        8*1=8
//        9*1=9

        // 레이블 사용 - 외부 반복까지 종료
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 5) {
                    break outer;  // outer 레이블의 반복 종료
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
//        i=1, j=1
//        i=1, j=2
//        i=1, j=3
//        i=2, j=1
//        i=2, j=2
//        i=2, j=3
//        i=3, j=1
//        i=3, j=2
//        i=3, j=3
    }
}
