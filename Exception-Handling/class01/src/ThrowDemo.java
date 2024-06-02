public class ThrowDemo {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        try {
            throw new ArithmeticException("Main Reason nahi dunga krana hai jho kar le");
        }catch (ArithmeticException e){
            //System.out.println(e.toString());
            e.printStackTrace();

        }
    }
}
