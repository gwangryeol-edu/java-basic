package b.oop;

public class intro {
    public static void main(String[] args) {
//        int width = 10;
//        int height = 5;
//        int rectangleArea = width * height;
//        System.out.println(rectangleArea);
//
//        int width2 = 100;
//        int height2 = 50;
//        int rectangleArea2 = width2 * height2;
//        System.out.println(rectangleArea2);
//
//        int width3 = 1000;
//        int height3 = 500;
//        int rectangleArea3 = width3 * height;
//        System.out.println(rectangleArea3);

        System.out.println(calArea(10, 5));
        System.out.println(calArea(100, 50));
        System.out.println(calArea(1000, 500));

        int rect = calArea(50, 80);
        System.out.println(rect);

    }
    public static int calArea(int height, int width) {
        return height * width;
    }

}
