package class05;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<String> P = (String s) -> s.length() >0;
        Predicate<String> P = (s) -> s.length() >0;
        boolean sumi  = P.test("Sumit");
        System.out.println(sumi);

        System.out.println("***************************************");

        int arr[] = {2,3,4,5,6,7,8,9,10};
        Predicate<Integer> p1 = (arg) -> arg%2 == 0;
        Predicate<Integer> p2 = (arg) -> arg%2 != 0;
        Predicate<Integer> p3 = (arg) -> arg > 4;
        display(p1,arr);
        System.out.println("-----------------------");
        display(p2,arr);
        System.out.println("-----------------------");
        display(p1.and(p3),arr);
        System.out.println("-----------------------");
        display(p1.or(p2),arr);
        System.out.println("-----------------------");
        display(p1.negate(),arr);

    }
    public static void display(Predicate<Integer> predicate,int []arr){
        for (int i = 0; i < arr.length; ++i){
            if(predicate.test(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
