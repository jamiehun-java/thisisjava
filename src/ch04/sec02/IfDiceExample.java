package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6 + 1);

        if (num == 1) {
            System.out.println("A");
        } else if (num == 2) {
            System.out.println("B");
        } else if (num == 3) {
            System.out.println("C");
        } else if (num == 4) {
            System.out.println("D");
        } else if (num == 5) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
