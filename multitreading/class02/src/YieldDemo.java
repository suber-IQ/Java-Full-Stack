
class MyDemoThread extends Thread{
    @Override
    public void run() {
        //job
        for (int i = 0; i < 5; ++i){
            //Yield is used to give up the cpu temp
            Thread.yield();
            System.out.println("Child Thread Job..." + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        MyDemoThread t1 = new MyDemoThread();
        t1.start();
        for (int i = 0; i < 5;++i){
            System.out.println("main Thread....");
        }
    }
}
