package ch09.sec04.exam02;

public class A {
    void useB(){
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

        B b = new B();

        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }

}
