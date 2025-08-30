package LinkedLists;
import java.util.Scanner;

public class SinglyList {

    private Node head;
    private Node tail;
    private int size;
    public SinglyList(){
        this.size=0;
    }

    private class Node{
       private  int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;
        }
        Node(int value, Node next){
            this.value=value;
            this.next=next;
        }

    }
    public void insertFirst(int x){
        Node node=new Node(x);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
   public void insertEnd(int x){
        Node node =new Node(x);
        if(tail==null){
            insertFirst(x);
            return;
        }
        tail.next=node;
        tail=node;
     size++;
   }
   public void insertPosition(int x,int index){
       if(index<0 || index>size){
           throw new IndexOutOfBoundsException("Invalid index: "+index);
       }
      if(index==0){
          insertFirst(x);
          return;
      }
      if(index==size){
          insertEnd(x);
          return;
      }
      Node temp=head;
      for(int i=1;i<index;i++){
          temp=temp.next;
      }
//       Node node =new Node(x);
//      node.next=temp.next; for this we can use the constructor function
       Node node=new Node(x,temp.next);
      temp.next=node;
      size++;
   }
    public void  PrintLL(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //Insertion using recursion

    public void InsertRec(int x,int index){
    head=insertRec(x,index,head);

    }
    private Node insertRec(int x,int index,Node node){
        if(index==0){
            Node temp=new Node(x,node);
            size++;
        }
       node.next= insertRec(x,index-1,node.next);
        return node;

    }


    public int deleteFirst(){
        if(head==null){
            tail=head;
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        int val=head.value;
       head=head.next;
        size--;
       return val;
    }
    public int deleteEnd(){
        int val=tail.value;
      if(size<=1){
          return deleteFirst();
      }
       Node temp=head;
     for(int i=0;i<size-2;i++){
         temp=temp.next;
     }
       tail=temp;
       tail.next=null;
       size--;
       return val;
    }

    public int deletePosition(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index==0){
           return deleteFirst();
        }
        if(index==size-1){
           return deleteEnd();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        int val=temp.next.value;
        Node toDelete=temp.next;
        temp.next = toDelete.next;

        toDelete.next = null;
        size--;
        return val;
    }
    public int getSize(){
        return size;
    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
