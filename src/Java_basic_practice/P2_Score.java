package Java_basic_practice;

public class P2_Score {
    public static void main(String[] args) {
        int score = 85;
        String isScore = "학점 : ";

        if (score >= 90) {
            System.out.println(isScore + "A");
        } else if (score >= 80) {
            System.out.println(isScore +"B");
        } else if (score >= 70) {
            System.out.println(isScore +"C");
        } else if (score >= 60) {
            System.out.println(isScore +"D");
        } else {
            System.out.println(isScore +"F");
        }
    }
}


//학점 : B