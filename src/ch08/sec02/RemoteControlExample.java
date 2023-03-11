package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        /** public 추상 메서드 */
        rc = new Television();
        rc.turnOn();
        rc.setChannel();
        rc.setVolume(40);
        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);

        rc = new Audio();
        rc.turnOn();
        rc.setChannel();
        rc.setVolume(5);
        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);


        /** 상수 필드 */
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        /** 정적 메서드 호출 */
        RemoteControl.changeBattery();
    }
}
