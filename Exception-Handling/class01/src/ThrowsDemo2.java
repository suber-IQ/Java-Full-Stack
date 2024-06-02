public class ThrowsDemo2 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        System.out.println("M1");
            m2();
    }
    public static void m2(){
        System.out.println("M2");
        m3();
    }
    public static void m3 () throws ArithmeticException{
        System.out.println("M3");
        try {
            System.out.println(10/0);

        }catch (Exception e){
            System.out.println("Mai hu m3 exception");
        }
        System.out.println("Sumit kumar");
    }
}
