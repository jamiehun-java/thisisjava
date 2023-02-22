package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);

        Car car2 = new Car("x6");
        System.out.println(car2.company);
        System.out.println(car2.model);

        Car car3 = new Car("x6", "red");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);

        Car car4 = new Car("i7", "black", 400);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
