package LinkedLists;

public class DoublyList {
    private Node head;
    private Node tail;
    int size;
   public DoublyList(){
       this.size=0;
       this.head=null;
       this.tail=null;
   }
    private class Node{
     private int value;
        private Node prev;
        private Node next;
        Node(int value){
            this.value=value;
            this.prev=null;
            this.next=null;
        }

        Node(int value,Node prev,Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
    }

    public void insertFirst(int x){
        Node node=new Node(x);

           node.next=head;
           node.prev=null;
           if(head!=null){
               head.prev=node;
           }
           else{
               tail=node;
           }
            head=node;
        size++;
        System.out.println("Inserted " + x + " at the start. Head: " + head.value + ", Tail: " + tail.value);
    }
    public void insertEnd(int x){
       Node node=new Node(x);
        node.next=null;
        // the below method is without using the tail method;
//       Node temp=head;
//       node.next=null;
//       if(head==null){
//           node.prev=null;
//           head=node;
//           return;
//       }
//       while(temp.next!=null){
//           temp=temp.next;
//       }
//       temp.next=node;
//       node.prev=temp;

        //using the tail method
        if(tail==null){
            head=node;
            tail=head;
        }
        else{
                tail.next=node;
                node.prev=tail;
                tail=node;
        }

       size++;
        System.out.println("Inserted " + x + " at the end. Tail is now: " + tail.value);

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
     Node node=new Node(x);

       node.prev=temp;
       node.next=temp.next;
       temp.next=node;

       if(node.next!=null){
           temp.next.prev=node;
       }
       size++;
    }
   public int deleteFirst(){
       if(head==null){
           throw new IllegalStateException("Cannot delete from an empty list");
       }
       int val=head.value;
      if(head==tail){
          head=null;
          tail=null;
      }
      else{
        head=head.next;
        head.prev.next=null;
        head.prev=null;
      }
       size--;
       return val;
   }

   public int deleteEnd(){
       if(tail==null){
           throw new IllegalStateException("Cannot delete from an empty list");
       }
       int val=tail.value;
       if (head == tail) { // Only one node in the list
           head = null;
           tail = null;

       } else {
           Node temp = tail;
           tail = tail.prev;
           tail.next = null;
           temp.prev = null;  // Remove forward link
       }
       size--;
       return val;
   }
   public int deletePosition(int index){
       if(index<0 || index>=size){
           throw new IndexOutOfBoundsException("Invalid index : "+index);
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
     temp.next=toDelete.next;
       toDelete.next.prev = temp;
       toDelete.next = null;
       toDelete.prev = null;
      size--;
     return val;
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
    public void printLL() {

        if(head == null){
            System.out.println("Empty List");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -- ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
}
