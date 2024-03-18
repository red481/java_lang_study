package ch09.sec03.exam01;

public class A {
    static class B{

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

    B field1 = new B();

    static B field2 = new B();

    A(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }

    static void method2(){
        B b = new B();
    }
}
