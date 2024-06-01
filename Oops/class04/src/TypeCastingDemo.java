public class TypeCastingDemo {


    public static void main(String[] args) {
        //converting from int to double (implicit or widening casting)
        int num = 10;
        System.out.println("The int value = " + num);

        double d = num;
        System.out.println("The double value = " + d);

        //converting from double to int (narrowing or explicit)
        double data = 10.55;
        System.out.println("The double value = " + data);

        int intData = (int) data;
        System.out.println("The int data = " + intData);
    }
}
