package ch07.sec02;

public class SmartPhone extends Phone{
    // field
    public boolean wifi;

    // constructor
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    // method
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("change the status of wifi");
    }

    public void internet(){
        System.out.println("connect the internet");
    }
}
