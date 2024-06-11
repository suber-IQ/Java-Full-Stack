
class PrintMsg{
    public synchronized void m1(){
        for(int i = 0; i < 5; ++i){
            System.out.println("Executed by " + Thread.currentThread().getName());
            System.out.println("Hello Sumit...");
            synchronized (this){
                System.out.println("Hello Sumit...");
                System.out.println("Executed by " + Thread.currentThread().getName());

            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("By Sumit....");
        }
    }
}

class SynThreadDemo extends Thread{
    PrintMsg p;
    SynThreadDemo(PrintMsg p){
        this.p = p;
    }
    @Override
    public void run() {
        p.m1();
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        PrintMsg p = new PrintMsg();
        SynThreadDemo t1 = new SynThreadDemo(p);
        SynThreadDemo t2 = new SynThreadDemo(p);
        t1.setName("Ye hai T1");
        t2.setName("Ye hai T2");
        t1.start();
        t2.start();
        for (int i = 0; i< 5; ++i){
            System.out.println("Hello Main...");
        }
    }
}
