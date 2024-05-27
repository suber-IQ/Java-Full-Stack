public class StaticVariable {
    static int a = 10;
    public static void main(String[] args) {

        //System.out.println(a);
        StaticVariable obj1 = new StaticVariable();
        obj1.a=100;
        System.out.println(obj1.a); // 100

        StaticVariable obj2 = new StaticVariable();
        obj2.a = 300;
        System.out.println(obj2.a);

        System.out.println(obj1.a);


    }



    public void demo(){
        System.out.println(a);
    }
}

class B{
    public void demo(){
        System.out.println(StaticVariable.a);
    }
}
