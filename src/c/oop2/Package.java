package c.oop2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*; // util 내에서 모든 클래스를 가져온

public class Package {
    public static void main(String[] args) {
        String.join(",");                      // String은 클래스이지만 자동으로 임포트
        ArrayList<String> List = new ArrayList<>();     // import java.util.ArrayList;
        HashMap<String,Integer> map = new HashMap<>();  // import java.util.HashMap;

    }
}
