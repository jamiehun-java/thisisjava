package ch03.sec09;

public class BitShiftExample2 {
    public static void main(String[] args) {
        int value = 772;

        // 우측으로 3바이트(24비트) 이동하고 끝 1바이트만 읽음
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println(int1);

        byte byte2 = (byte) (value >>> 16);
        int int2 = byte2 & 255;
        System.out.println(int2);

        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println(int3);

        byte byte4 = (byte) value;
        int int4 = byte4 & 255;
        System.out.println(int4);
    }
}
