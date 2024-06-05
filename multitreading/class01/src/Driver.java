
class ThreadDemo2 extends Thread{
    @Override
    public void run() {
        //job
        for (int i = 0; i < 30; ++i){
            System.out.println("Sumit kumar");
        }

    }
}
public class Driver {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadDemo2 t1 = new ThreadDemo2();
        System.out.println(t1.getName());
        Thread.currentThread().setName("Sumit kumar");
        System.out.println(Thread.currentThread().getName());

        //
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());

        System.out.println("------------");
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
    }
}
