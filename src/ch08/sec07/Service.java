package ch08.sec07;

public interface Service {

    default void defaultMethod1(){
        System.out.println("defaultMethod1() default 메서드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2() default 메서드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultCommon() 중복 코드A");
        System.out.println("defaultCommon() 중복 코드B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1() static 메서드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod2() static 메서드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticCommon() 중복 코드A");
        System.out.println("staticCommon() 중복 코드B");
    }
}
