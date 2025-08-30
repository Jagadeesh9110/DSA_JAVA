package LinkedLists;

public class CircularList {
    private Node head;
    private Node tail;
    private int Size;

    public CircularList() {
        this.Size = 0;
        this.head=null;
        this.tail=null;
    }

    private class Node{
        private int value;
        private Node next;
       Node(int value){
           this.value=value;
           this.next=null;
       }
       Node(int value ,Node next){
           this.value=value;
           this.next=next;
       }

    }

    public void insertFirst(int x){
        Node node=new Node(x);

        // Singly circular
        if(head==null){
           head=node;
           node.next=head;
           tail=head;
        }
        else{
            node.next=head;
            head=node;
            tail.next=head;
        }
        Size++;

    }
    public void insertEnd(int x){
        Node node=new Node(x);

        // Singly circular
        if(head==null){
            head=node;
            tail=head;
            tail.next=head;
        }
        else{
            node.next=head;
            tail.next=node;
            tail=node;
        }
        Size++;
    }

    public void insertPosition(int x,int index){
        Node node=new Node(x);
        if(index<0 || index>Size){
            throw new IndexOutOfBoundsException("Invalid : "+index);
        }
        if(index==0){
            insertFirst(x);
            return;
        }
        if(index==Size){
            insertEnd(x);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        Size++;
    }

    public int deleteFirst(){
        if(head==null){
            throw new NullPointerException("Cannot delete the element from empty list");
        }

        int val=head.value;
        if(head==tail){
            head=null;
            tail=null;
        }
       else{
            tail.next=head.next;
            head=tail.next;
        }
        Size--;
        return val;
    }

    public int deleteEnd(){
        if(tail==null){
            throw new NullPointerException("Cannot delete the element from empty list");
        }

        int val=tail.value;
        if(head==tail){
            head=null;
            tail=null;

        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail.next=null;
            temp.next=head;
            tail=temp;
        }
         Size--;
        return val;
    }
    public int deletePosition(int index){
        if(index<0 || index>=Size){
            throw new IndexOutOfBoundsException("Invalid index : "+index);
        }
        if(index==0){
            return deleteFirst();
        }
        if(index==Size-1){
            return deleteEnd();
        }

        if(head==tail){
            int val=head.value;
            head=null;
            tail=null;
            Size--;
            return val;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node toDelete=temp.next;
        int val=toDelete.value;
        temp.next=toDelete.next;
        toDelete.next=null;
        Size--;
        return val;
    }
    public void printLl() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("End");
    }
    public void clear() {
        head = null;
        tail = null;
        Size = 0;
    }
    public int getSize(){
        return this.Size;
    }

}
