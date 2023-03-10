package ch07.sec06.pkg2;

import ch07.sec06.pkg1.A;
public class D extends A{
    // constructor
    public D(){
        super();
    }

    // method (가능)
    public void method1(){
        // change A field value
        this.field = "value";
        this.method();
    }

//    // method
//    public void method2(){
//        A a = new A(); // 직접 객체 생성해서 사용하는 것 불가능
//        a.field = "value";
//        a.method();
//    }
}
