package Java_basic_practice;

public class P3_LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "는 윤년입니다");
        } else {
            System.out.println(year + "는 윤년이 아닙니다");
        }
    }
}


// 2024는 윤년입니다