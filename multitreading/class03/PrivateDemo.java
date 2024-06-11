package class03;


class MyPrivateDemo{
    private int privateVariable = 10;
    private void privateDemoMethod(){
        System.out.println("Main hu private");
    }
}

public class PrivateDemo {
    public static void main(String[] args) {
        MyPrivateDemo m1 = new MyPrivateDemo();
        // m1.privateVariable
        MyDefaultDemo d1 = new MyDefaultDemo();
        System.out.println(d1.a);
        d1.print();
    }
}
