package class03;

public class ProtectedCheckDemo extends MyProtectedClass{
    public static void main(String[] args) {
        MyProtectedClass p1 = new MyProtectedClass();
        System.out.println(p1.a);
        p1.display();
    }
}
