package Question;

import java.util.Scanner;

public class PatternQuestion {
    public static void main(String[] args) {
    // Solid star triangle

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please Enter rows n: ");
        int n = s1.nextInt();

       for(int i = 0; i<n; ++i){
           for(int j = 0; j < i + 1; ++j){
               System.out.print("* ");
           }
           System.out.println();
       }
       System.out.println("End execution...");
    }
}
