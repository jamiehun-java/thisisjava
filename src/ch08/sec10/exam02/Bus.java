package ch08.sec10.exam02;

public class Bus implements Vehicle{
    //추상 메서드 재정의
    @Override
    public void run(){
        System.out.println("Bus is running");
    }

    //추가 메서드
    public void checkFare(){
        System.out.println("Check the fare");
    }
}
