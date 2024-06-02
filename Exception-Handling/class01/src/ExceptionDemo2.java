public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        try{
            System.out.println("inside try");
            System.out.println(10/0);

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Main hu don");
        }
    }
}
