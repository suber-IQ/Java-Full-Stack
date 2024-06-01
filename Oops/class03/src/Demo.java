
class Test{
    Test(){
        System.out.println("Mai Test hu....");
    }
}

public class Demo extends Test {
    int a;
    Demo(){
//        super();// calling parent class constructor
        this(10);
        System.out.println("hello mai hu Demo Default constructor...");
    }
    public Demo(int i){
        System.out.println("Arg.......");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
    }
}
