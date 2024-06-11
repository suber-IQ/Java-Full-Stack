package class03;

class MyProtectedClass{
    protected int a = 99;
    protected  void display(){
        System.out.println("Main hu Protected Method...");
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        MyProtectedClass p1 = new MyProtectedClass();
        System.out.println(p1.a);
    }
}
