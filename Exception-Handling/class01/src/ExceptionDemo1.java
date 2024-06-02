public class ExceptionDemo1 {
    public static void main(String[] args) {
//        System.out.println("Hello Sumit");
//        System.out.println(10/0);  // abnormal termination
//        System.out.println("Hello sumit Ji");


//        System.out.println("Hello sumit");
//        try{
//            System.out.println(10/0);
//        }catch(Exception e){
//            //e.printStackTrace();
//        }
//        System.out.println("Hello sumit kumar ji");
        m1();
    }
    public static void m1(){
        System.out.println("Hello M1");
        m2();
        System.out.println("Bye M1");

    }
    public static void m2(){
        System.out.println("Hello M2");
        try {
            System.out.println("In Try block");
            System.out.println(10/0);
            System.out.println("Try block"); // line 28

        }catch (Exception e){
            System.out.println("aao bhai exception");
            //e.printStackTrace(); //l+d+en
            //System.out.println(e.toString()); //en+des
            //System.out.println(e.getMessage()); // des
        }
        System.out.println("Bye M2");

    }
}
