public class ThrowsDemo {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        System.out.println("M1");
        try{
            m2();
        }catch (Exception e){
            System.out.println("Main hu m1 Exception");
        }
    }
    public static void m2() throws ArithmeticException{
        System.out.println("M2");
        m3();
    }
    public static void m3 () throws ArithmeticException{
        System.out.println("M3");
        System.out.println(10/0);
        System.out.println("Sumit kumar");
    }
}
