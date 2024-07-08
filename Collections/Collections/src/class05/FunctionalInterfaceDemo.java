package class05;

@FunctionalInterface
interface Sumit{
    public void m1();
   //public void m2();
    //override
    default void print(){
        System.out.println("print default method");
    }
    static void display(){
        System.out.println("print static method");
    }
}
class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Job = " + i);
        }
    }
}

public class FunctionalInterfaceDemo implements Sumit {
    public static void main(String[] args) {
        System.out.println("main");
        Sumit.display();

//        MyThread myThread = new MyThread();
//        Thread thread = new Thread(myThread);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Job = " + i);
            }
        });
        thread.start();
    }

    @Override
    public void m1() {

    }

    @Override
    public void print() {
        Sumit.super.print();
    }
}
