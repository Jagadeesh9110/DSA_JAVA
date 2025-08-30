package Stack;

import java.util.*;

public class StackExamples {
    public static void main(String[] args) {

        // Stacks
        Stack<Integer> stack =new Stack<>();
        stack.push(23);
        stack.push(45);
        stack.push(19);
        stack.push(4);
        stack.push(32);

        for(int i=stack.size();i>0;i-- ){
            System.out.println(stack.pop());
        }
         
        // Queues
        Queue<Integer> queue=new LinkedList<>(); // here queue is an interface , it is same of as linked list
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
        Deque<Integer> deque=new ArrayDeque<>();// here ArrayDeque is used to create the object of the deque and exit the methods present in the deque interface
            deque.add(87);
            deque.addFirst(56);
            deque.addLast(78);
        System.out.println(deque.removeFirst());

    }
}
