package ch09.sec02.exam02;

public class A {
    class B{
        int field1 = 1;
        static int field2 = 2;

        B(){
            System.out.println("B 객체가 생성됨");
        }

        void method1(){
            System.out.println("method1() 호출됨");
        }

        static void method2(){
            System.out.println("method2() 호출됨");
        }
    }

    void useB(){
        B b = new B();
        b.field1 = 3;
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
