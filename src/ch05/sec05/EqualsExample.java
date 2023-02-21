package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "안중근";
        String strVar2 = "안중근";

        if(strVar1 == strVar2){
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("문자열이 같음");
        }

        String strVar3 = new String("안중근");
        String strVar4 = new String("안중근");

        if(strVar3 == strVar4){
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("문자열이 같음");
        }
    }
}
