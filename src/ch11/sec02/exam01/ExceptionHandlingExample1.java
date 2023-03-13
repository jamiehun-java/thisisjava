package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("result = " + result);
        } catch(NullPointerException e){
//            System.out.println(e.getMessage()); // 예외정보를 얻는 3가지 방법 ... 1
//            System.out.println(e.toString());   // 예외정보를 얻는 3가지 방법 ... 2
            e.printStackTrace();                // 예외정보를 얻는 3가지 방법 ... 3
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("START");
        printLength("thisisjava");
        printLength(null);
        System.out.println("FINISH");
    }
}
