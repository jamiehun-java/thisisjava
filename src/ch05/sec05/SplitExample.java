package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습,홍길동";

        String[] tokens = board.split(",");

        // for 문을 활용
        for(int i = 0; i< tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
