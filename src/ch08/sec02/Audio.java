package ch08.sec02;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    /** 추상 메서드 */
    @Override
    public void setChannel(){
        System.out.println("채널을 조정합니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if (volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("volume = " + this.volume);
    }

    /** 디폴트 메서드 */
    //필드
    private int memoryVolume;

    //디폴트메서드 재정의
    @Override
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }

}
