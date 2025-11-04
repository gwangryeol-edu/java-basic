package Java_basic_practice;

public class P5_Season {
    public static void main(String[] args){
        int month = 7;

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


//summer