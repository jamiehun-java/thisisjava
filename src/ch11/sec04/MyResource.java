package ch11.sec04;

public class MyResource implements AutoCloseable{
    private String name;

    public MyResource(String name){
        this.name = name;
        System.out.println("OPEN [" + name + "] RESOURCE");
    }

    public String read1(){
        System.out.println("READ [" + name + "] RESOURCE");
        return "100";
    }

    public String read2(){
        System.out.println("READ [" + name + "] RESOURCE");
        return "abc";
    }

    @Override
    public void close() throws Exception{
        System.out.println("CLOSE [" + name + "] RESOURCE");
    }
}
