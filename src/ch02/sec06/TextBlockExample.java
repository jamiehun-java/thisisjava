package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n"+
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id":"witner",
                    "name":"눈송이
                }
                """;

        System.out.println(str1);
        System.out.println("------------------------");
        System.out.println(str2);
        System.out.println("------------------------");
        String str = """
                나는 자바를 \
                학습합니다
                나는 자바의 진정한 고수, 프로가 될겁니다.
                """;
        System.out.println(str);
    }
}
