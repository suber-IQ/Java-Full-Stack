

public class InstanceVariableDemo {
    int a = 10;  //instance variable
    int b;
    public static void main(String[] args) {
        InstanceVariableDemo instance = new InstanceVariableDemo();
                System.out.println(instance.a);
                System.out.println(instance.b);
                //System.out.println(this.a);
                     instance.a = 100;
                     instance.b = 200;
                     System.out.println(instance.a);
                     System.out.println(instance.b);

    }
    public void demo(){
        System.out.println(a);
    }
}
