package ch07.sec05.exam02;

public class Car {
    // field
    public int speed;

    // method
    public void speedUp(){
        speed += 1;
    }

    // final method
    public final void stop(){
        System.out.println("stop the car");
        speed = 0;
    }
}
