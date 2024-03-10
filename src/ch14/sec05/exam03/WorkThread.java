package ch14.sec05.exam03;

public class WorkThread extends Thread{
    public boolean work = true;

    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        while(true){
            if(work){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println("--------------------------");
                System.out.println(getName() + ": 작업중... id : " +Thread.currentThread().getId());
            }else{
                Thread.yield();
            }
        }
    }
}
