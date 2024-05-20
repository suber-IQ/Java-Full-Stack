package Dec172023;

public class ArrayDemo {
    public static void main(String[] args) {
        // int arr[] = new int[10];

        // for(int i = 0; i < arr.length; ++i){
        //     arr[i] = 2 * (i+1);
        // }

        // for(int i = 0; i < arr.length; ++i){
        //     System.out.println(arr[i]);
        // }
        // 👉Example 2 
        int arr[] = {10,20,30,40,50};
        for(int a : arr){
            System.out.println(a);
        }
        System.out.println("--------------");
        arr[3] = 100;
        for(int a: arr){
            System.out.println(a);
        }
        System.out.println("--------------");
        //length
        System.out.println("Length of array: " + arr.length);

    }
}
