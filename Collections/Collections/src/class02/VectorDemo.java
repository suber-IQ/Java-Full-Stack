package class02;
// vector is thread safe (capicity 2 and default 10)
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
//        ----------- part 1 -----
        Vector<Integer> vector = new Vector<Integer>();
        ArrayList<Integer> list = new ArrayList<>();

//
//        System.out.println(vector.capacity());
//
        for(int i = 1; i <= 5; ++i){
            vector.add(i * 10);
            list.add(i*5);
        }
//        System.out.println(vector.capacity());
////        vector.addElement(); // homework
//        vector.addElement(90);
//        System.out.println(vector.capacity());
////        System.out.println(vector);

//        ----------- part 2 -----
        //vector (enumeration use for legacy class( vector,dictionary) only for read) (movement(forword))
//        Enumeration<Integer> elements = vector.elements(); // only use ready enumeration (java 1.0.0)
//        while(elements.hasMoreElements()){
//            Integer integer = elements.nextElement();
//            System.out.println(integer);
//        }

//        ----------- part 3 ----- (IMPORTANT USE FOR LIST)
       // only list ((Read,Remove & Replace)listIterator with two dimensional use (left to right OR right to left(reverse)) (movement(Bi-direction)
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());

        }



//        ----------- part 4 -----

        // Arralist (Read & remove (Iterator) use for all with one dimensional use (left to right)) (movement (forward))
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        **** Important:- HashSet => current-capicity(16) , fill-Ratio(75% (.75))

    }
}
