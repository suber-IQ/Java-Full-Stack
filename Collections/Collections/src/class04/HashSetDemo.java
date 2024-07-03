package class04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetDemo {
    public static void main(String[] args) {
        int arr[] = {10,20,40,10,30,50};
//        HashMap<Integer,Integer> map = new HashMap<>();
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

        for(int val:arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }

        System.out.println(map);
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
//            map.put(10,20);
            System.out.println(iterator.next());
            map.put(888,909);
        }
    }
}
