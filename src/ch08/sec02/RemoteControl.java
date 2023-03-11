package ch08.sec02;

public interface RemoteControl{
    /** public 추상 메서드 */
    public void turnOn();

    /** 상수 필드 */
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    /** 추상 메서드 */
    void setChannel();
    void turnOff();
    void setVolume(int volume);

    /** 디폴트 인스턴스 메서드 */
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
}
