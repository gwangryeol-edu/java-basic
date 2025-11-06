package c.oop2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // 클래스 이름 수정

        int result = cal.add(3, 4);        // 반환값을 변수에 저장
        System.out.println(result);
        User u = new User("홍길동", 40);// 변수 출력
        u.setName("김길동");
    }

}