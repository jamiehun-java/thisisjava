package ch07.sec02;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell(){
        System.out.println("ring the bell");
    }

    public void sendVoice(String message){
        System.out.println("me: " + message);
    }

    public void receiveVoice(String message){
        System.out.println("you: " + message);
    }

    public void hangUp(){
        System.out.println("finish");
    }
}
