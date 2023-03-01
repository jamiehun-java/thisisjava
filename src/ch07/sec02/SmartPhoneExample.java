package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // smartphone object create
        SmartPhone myPhone = new SmartPhone("iPhone", "white");

        // field
        System.out.println("myPhone.model = " + myPhone.model);
        System.out.println("myPhone.color = " + myPhone.color);

        System.out.println("myPhone.wifi = " + myPhone.wifi);

        // call the method
        myPhone.bell();
        myPhone.sendVoice("hi");
        myPhone.receiveVoice("hello, there");
        myPhone.sendVoice("nice to meet you");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }


}
