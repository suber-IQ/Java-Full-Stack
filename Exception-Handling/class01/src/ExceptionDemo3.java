public class ExceptionDemo3 {
    static int a = 10;
    public static void main(String[] args) {
        System.out.println(print());
    }

    public static int print(){
       // System.exit(0);

        try{
            System.out.println(10/0);

            //System.exit(0);
            try{
                System.out.println("Maira dusara naam Gupta");
                System.out.println(10/0);
            }catch (ArithmeticException ed){
                return 55;
            }finally {
                return 333;
            }

        }catch (ArithmeticException e){
            a = 778;
            return a;
        }finally {
            //a = 225;
            return a;
        }
    }
}
