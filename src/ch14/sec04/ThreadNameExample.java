package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println((mainThread.getName()) + " is running");


        Thread threadA = new Thread(){
            @Override
            public void run(){
                for (int j = 0; j < 5; j++) {
                    System.out.println(getName() + " is running");
                }
            }
        };
        threadA.setName("Thread-A");
        threadA.start();


        Thread chatThread = new Thread(){
            @Override
            public void run(){
                System.out.println(getName() + " is running");
            }
        };
        chatThread.setName("Chat-thread");
        chatThread.start();
    }
}
