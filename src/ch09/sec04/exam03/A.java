package ch09.sec04.exam03;

public class A {
    public void method1(int arg){
        int var = 1;

        final int fvar = 1;

        class B {
            void method2() {
                System.out.println("arg: " + arg);
                System.out.println("var: " + fvar);

            }
        }

        B b = new B();
        b.method2();

        var = 2;
        var = 3;}
}
