package Stack;


public class main {
    public static void main(String[] args) throws StackException, QueueException {
//        CustomStack stack=new CustomStack();
//        stack.push(23);
//        stack.push(45);
//        stack.push(19);
//        stack.push(4);
//        stack.push(32);
//
       //   stack.display();

        // Dynamic Stack

//        DynamicStack stack1=new DynamicStack(5);
//        stack1.push(23);
//        stack1.push(45);
//        stack1.push(19);
//        stack1.push(4);
//        stack1.push(32);
//        stack1.push(65);// it will insert an item although the customStack operation is full this is dynamic stack
//
//          stack1.display();
//
//          // custom Queue
//
//        CustomQueue queue= new CustomQueue(5);
//         queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//        queue.display();

        CircularQueue cirQueue=new CircularQueue(5);
        cirQueue.insert(2);
        cirQueue.insert(3);
        cirQueue.insert(4);
        cirQueue.insert(5);
        cirQueue.insert(6);
        cirQueue.display();

        System.out.println(cirQueue.remove());
        cirQueue.display();

    }
}
