
class Demo extends Thread{
    @Override
    public void run() {
        //job
        for(int i = 0; i < 30; ++i){
            System.out.println("Jai Shri Ram...");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
      for(int i = 0; i < 10; ++i){
          System.out.println("Main");
      }
    }
}
