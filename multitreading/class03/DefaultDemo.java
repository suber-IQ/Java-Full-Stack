package class03;

class MyDefaultDemo{
    int a = 120;
    void print(){
        System.out.println("Sumit kumar...");
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        MyDefaultDemo d1 = new MyDefaultDemo();
        System.out.println(d1.a);
        d1.print();
    }
}
