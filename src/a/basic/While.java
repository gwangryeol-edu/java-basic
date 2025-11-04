package a.basic;

public class While {
    public static void main(String[] args) {

        //while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------------");
        // do-while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while ( j< 10);
    }
}
