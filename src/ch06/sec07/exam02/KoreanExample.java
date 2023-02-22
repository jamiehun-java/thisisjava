package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean k1 = new Korean("김자바", "111222-3334444");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        Korean k2 = new Korean("박자바", "444333-6667777");

        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
