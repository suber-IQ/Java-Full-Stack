
abstract class Vehicle{
    int a;
    public abstract void engine();
    Vehicle(){

    }
    public void print(){
        System.out.println("hello");
    }

}

public class AbstractDemo extends Vehicle{
    @Override
    public void engine() {
        System.out.println("Car Engine");
    }

    public static void main(String[] args) {
        Vehicle v = new AbstractDemo();
        v.engine();
        System.out.println(v.a);
    }
}
