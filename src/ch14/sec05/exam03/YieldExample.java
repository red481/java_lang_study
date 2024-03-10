package ch14.sec05.exam03;

import java.awt.image.Kernel;

public class YieldExample {
    public static void main(String[] args) {
        System.out.println("[ Thread 생성 전 ] 사용하고 있거나 사용 가능한 모든 스레드의 개수 : " + Runtime.getRuntime().availableProcessors());
        System.out.println("[ Thread 생성 전 ] 현재 실행중인 모든 스레드의 개수 : " + Thread.activeCount());


        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println(workThreadA.getName() + "[Thread 시작 후 ] 사용하고 있거나 사용 가능한 모든 스레드의 개수 : " + Runtime.getRuntime().availableProcessors());
        System.out.println(workThreadA.getName() + "[Thread 시작 후 ] 현재 실행중인 모든 스레드의 개수 : " + Thread.activeCount());

        try{Thread.sleep(5000);}catch(Exception e){}
        workThreadA.work = false;

        System.out.println(workThreadA.getName() + " - if문 false ] 사용하고 있거나 사용 가능한 모든 스레드의 개수 : " + Runtime.getRuntime().availableProcessors());
        System.out.println(workThreadA.getName() + " - if문 false ] 현재 실행중인 모든 스레드의 개수 : " + Thread.activeCount());
        try{Thread.sleep(10000);}catch(Exception e){}
        workThreadA.work = true;

        System.out.println(workThreadA.getName() + " - if문 true ] 사용하고 있거나 사용 가능한 모든 스레드의 개수 : " + Runtime.getRuntime().availableProcessors());
        System.out.println(workThreadA.getName() + " - if문 true ] 현재 실행중인 모든 스레드의 개수 : " + Thread.activeCount());

    }
}
