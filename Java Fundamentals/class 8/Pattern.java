import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // 1️⃣ solid star triangle
        // try (
        // Scanner s1 = new Scanner(System.in)) {
        //     System.out.println("Enter the number of rows: ");
        //     int n = s1.nextInt();
        //     for(int i = 0; i < n; ++i){
        //         for(int j = 0; j < i + 1; ++j){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
        // }
        // 2️⃣ reverse solid star triangle
        // try (
        // Scanner s1 = new Scanner(System.in)) {
        //     System.out.println("Enter the number of rows: ");
        //     int n = s1.nextInt();
        //     for(int i = 0; i < n; ++i){
        //         for(int j = 0; j < n - i; ++j){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
        // }
        // 3️⃣ solid numeric triangle
        // try (
        // Scanner s1 = new Scanner(System.in)) {
        //     System.out.println("Enter the number of rows: ");
        //     int n = s1.nextInt();
        //     for(int i = 0; i < n; ++i){
        //         for(int j = 0; j < i + 1; ++j){
        //             System.out.print(j + 1);
        //         }
        //         System.out.println();
        //     }
        // }
        // 4️⃣ solid numeric triangle
        try (
        Scanner s1 = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = s1.nextInt();
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < n - i; ++j){
                    System.out.print(j + 1);
                }
                System.out.println();
            }
        }
    }
}
