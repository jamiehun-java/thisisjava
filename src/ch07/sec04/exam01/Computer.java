package ch07.sec04.exam01;

public class Computer extends Calculator{
    //Method overriding
    @Override
    public double areaCircle(double r){
        System.out.println("Run areaCircle() in Computer object");
        return Math.PI * r *r;
    }
}
