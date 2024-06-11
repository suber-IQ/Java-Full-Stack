
class MyThread3 extends Thread{
    Thread t1;
    MyThread3(Thread t1){
        this.t1 = t1;
    }

    @Override
    public void run() {
        //job
        for(int i = 0; i < 5; ++i){
            System.out.println("MyThread3 starting..");
            try{
                t1.join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyDemoThread1 extends Thread{
    @Override
    public void run() {
        //job
        for (int i = 0; i < 5; ++i){
            System.out.println("Child Thread Starting..." + i);
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyDemoThread1 t1 = new MyDemoThread1();
        MyThread3 t2 = new MyThread3(t1);
        t1.start();
        t2.start();
        t2.join();  // excuted by main thread
       //t2.interrupt();
        for (int i = 0; i < 5;++i){
            System.out.println("main Thread....");
        }
    }
}
