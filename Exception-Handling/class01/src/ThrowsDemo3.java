public class ThrowsDemo3 {
    public static void main(String[] args) throws InterruptedException {
        m1();
    }
    public static void m1() throws InterruptedException {
        System.out.println("M1");
       m2();
    }
    public static void m2() throws InterruptedException {
        System.out.println("M2");
        m3();
    }
    public static void m3 () throws InterruptedException {
        System.out.println("M3");
        Thread.sleep(3000);
       // System.out.println(10/0); // unchecked method (Arithmetic Exception)
        System.out.println("Sumit kumar");
    }
}
