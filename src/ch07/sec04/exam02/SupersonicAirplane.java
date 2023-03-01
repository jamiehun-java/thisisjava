package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    // constant
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    // state field
    public int flyMode = NORMAL;

    // 메소드 재정의
    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("supersonic flying");
        } else {
            //Airplane 객체의 fly() 메소드 호출
            super.fly();
        }
    }
}
