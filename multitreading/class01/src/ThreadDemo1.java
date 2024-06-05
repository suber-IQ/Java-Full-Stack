
class Demo1 implements Runnable{
    @Override
    public void run() {
        //job
        for (int i = 0; i < 30; ++i){
            System.out.println("Sumit");
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {

        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        t1.start();
        for(int i = 0; i < 10; ++i){
            System.out.println("Main");
        }
    }
}
