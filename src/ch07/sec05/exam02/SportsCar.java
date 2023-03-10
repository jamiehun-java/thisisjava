package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp(){
        speed += 10;
    }

    // Not Override
//    @Override
//    public void stop(){
//        System.out.println("STOP the sports care"); // final로 인한 상속 불가
//        speed = 0;
//    }



}
