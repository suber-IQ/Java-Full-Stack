package class01;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListDemo = new LinkedList<Integer>();

        linkedListDemo.add(10);
        linkedListDemo.add(20);
        linkedListDemo.add(80);
        linkedListDemo.add(40);
        linkedListDemo.add(50);
        linkedListDemo.add(60);

        System.out.println(linkedListDemo);
    }
}
