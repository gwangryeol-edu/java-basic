public class IfStatement {
    public static void main(String[] args) {

        int age = 39;

        if (age >= 20) {
            System.out.println("성인입니다.");
        }


        int score = 90;
        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("재수강");
        }

        int score2 = 30;
        if (score2 >= 90) {
            System.out.println("A");
        } else if(score2 >= 80) {
            System.out.println("B");
        } else if(score2 >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }



        int month = 4;
        String season = switch (month) {
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "fall";
            case 12, 1, 2 -> "winter";
            default -> "false";
        };

        System.out.println(season);
    }
}
