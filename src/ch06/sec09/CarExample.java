package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("Porsche");
        Car yourCar = new Car("bmw");

        myCar.run();
        yourCar.run();
    }
}
