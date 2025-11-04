package a.basic.practice1;

public class P9_Discount {
    public static void main(String[] args) {
        int price = 120000;
        boolean isMember = true;

        int dc = 0;
        double total = 0;

        if(price >= 100000){
            dc = 10;
            total = price * 0.9;
        } else if (price >= 50000) {
            dc = 5;
            total = price * 0.95;
        } else {
            total = price;
        }

        if (isMember) {

            dc += 5;
            total *= 0.95;
        }

        System.out.println("원가 : " + price + "원");
        System.out.println("할인율 : " + dc + "%");
        System.out.println("최종금액 : " + total + "원");
    }
}
