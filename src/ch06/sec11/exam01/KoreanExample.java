package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체 생성시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-7894561", "김밥");

        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // Final 필드 변경 (불가)
//        k1.nation = "USA";

        // 다른 필드값 변경
        k1.name = "Victory";
    }
}
