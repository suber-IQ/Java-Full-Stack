package Dec222023;

public class FindKArray {
    public static void main(String[] args) {
        int arr[] = {10,11,13,16,18,19};
        int k = 18;

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == k){
                System.out.println(i);
                break;
            }
        }
    }
}
