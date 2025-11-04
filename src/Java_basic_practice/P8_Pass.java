package Java_basic_practice;

public class P8_Pass {
    public static void main(String[] args) {

        int math = 70, english = 80, science = 45;
        int avg = (math + english + science) / 3;

        if (avg >= 60 || (math >= 40 && english >= 40 && science >= 60)) {

            System.out.println("합격");
        } else if (avg < 60) {
            System.out.println("불합격(평균미달)");
        } else if (math >= 40 || english >= 40 || science >= 60) {
            System.out.println("불합격(과목 낙제)");
        } else {
            System.out.println("불합격(평균미달+과목낙제");
        }
    }
}


// 합격