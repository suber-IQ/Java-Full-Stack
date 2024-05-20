package Dec172023;

public class BreakNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer loop: i = " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("    Inner loop: j = " + j);
                if (j == 2) {
                    break;  // This will only break out of the inner loop
                }
            }
        }
        System.out.println("Over loop..");
    }
}
