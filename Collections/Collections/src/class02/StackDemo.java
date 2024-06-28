package class02;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack);
        for(int i = 1; i <= 5; ++i){
            stack.push(i*10);
        }

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
