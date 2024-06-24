package class01;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class A implements Cloneable{
    int a = 10;
    @Override
    public A clone() {
        try{
            return (A) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}

public class CollectionsDemo {
    //order
    //duplicates allowed
    //index
    //O(1)
    public static void main(String[] args) {
        //---- PART 1
//        List<Integer> list =  new ArrayList<Integer>();
//        list.add(40);
//        list.add(20);
//        list.add(20);
//        list.add(30);
//        list.add(10);
//        System.out.println(list);

        //---- PART 2
//        A object = new A();
//        System.out.println(object.hashCode());
//        System.out.println(object.a);
//        A cloneObject = object.clone();
//        object.a= 20;
//        System.out.println(object.a);
//        System.out.println(cloneObject.hashCode());
//        System.out.println(cloneObject.a);

        //---- PART 3
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(130);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(2));
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(50);
        list1.add(60);
        list1.add(70);
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains(30));
        System.out.println(list.contains(50));
        System.out.println(list.isEmpty());


//        for(int i =0; i < list.size(); ++i){
//            System.out.println(list.get(i));
//        }

        //iterator
//       Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //for each
//        for(Integer value:list){
//            System.out.println(value);
//        }

    }
}
