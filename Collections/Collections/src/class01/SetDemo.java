package class01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(10);
        set.add(80);
        set.add(30);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println(set.remove(30));
        System.out.println();
        System.out.println(set);
    }
}
