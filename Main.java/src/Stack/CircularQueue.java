package Stack;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0 ;
    protected int front=0;
    private int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++]=item;
        end=end % data.length;
        size++;
        return true;
    }
    public int remove() throws QueueException{
        if(isEmpty()){
            throw new  QueueException("Cannot remove from the  empty queue");
        }

        int removed=data[front++];
        front=front % data.length;
        size--;
        return removed;
    }
    public int front() throws QueueException{
        if(isEmpty()){
            throw new  QueueException("Cannot remove from the  empty queue");
        }
        return data[front];
    }
    public void display() throws QueueException{
        if(isEmpty()){
            throw new  QueueException("Cannot remove from the  empty queue");
        }
       int i=front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i %=data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
