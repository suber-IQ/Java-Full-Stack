package Dec222023;

public class MaxNumber {
    public static void main(String[] args) {

            int arr[] = {12,98,35,24,18,38,55,44};
            int max = arr[0];

            for(int i = 0; i < arr.length; ++i){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max);
            


    }
}
