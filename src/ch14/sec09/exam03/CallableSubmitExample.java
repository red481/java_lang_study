package ch14.sec09.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableSubmitExample {
    public static synchronized void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futureList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 1; i <= 100; i++){
            final int idx = i;
            futureList.add(executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i = 1; i <= idx; i++){
                        sum += i;
                    }

                    Thread thread = Thread.currentThread();
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}

                    System.out.println("[" + thread.getName() + "]" + idx + " 합 계산");
                    return sum;
                }
            }));
        }
        executorService.shutdown();
        while(executorService.isTerminated() == false){
            try {
                Thread.sleep(0);
            }catch (InterruptedException e){};
        }

        long endTime = System.currentTimeMillis();
        System.out.println("작업 시간: " + (endTime - startTime) + "ms");
    }
}
