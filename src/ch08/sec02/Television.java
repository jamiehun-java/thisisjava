package ch08.sec02;

import java.rmi.Remote;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    /** 추상메서드 */
    @Override
    public void setChannel(){
        System.out.println("채널을 조정합니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("volume = " + volume);
        } else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("volume = " + this.volume);
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
