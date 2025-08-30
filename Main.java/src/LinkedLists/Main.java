package LinkedLists;

public class Main {
    public static void main(String[] args) {


          SinglyList ll=new SinglyList();
          ll.insertFirst(5);
          ll.insertFirst(7);
          ll.insertFirst(8);
          ll.insertEnd(9);
          ll.insertPosition(6,2);
          ll.PrintLL();

        System.out.println(ll.getSize());

        System.out.println(ll.deleteFirst());
        ll.PrintLL();
        System.out.println(ll.getSize());

        System.out.println(ll.deleteEnd());

        System.out.println(ll.deletePosition(2));
        ll.PrintLL();
        System.out.println(ll.getSize());

        System.out.println(ll.find(7));


//         Doubly Linked lists
//        DoublyList Dl=new DoublyList();
//
//        Dl.insertFirst(8);
//        Dl.insertFirst(6);
//        Dl.insertFirst(5);
//        Dl.insertFirst(3);
//        Dl.printLL();
//
//        System.out.println(Dl.getSize());
//
//        Dl.insertPosition(7,3);
//        Dl.printLL();
//
//        System.out.println(Dl.getSize());
//
//        Dl.insertEnd(9);
//        Dl.printLL();
//        System.out.println(Dl.getSize());
//
//
//        System.out.println(Dl.deleteFirst());
//        Dl.printLL();
//        System.out.println(Dl.getSize());
//
//
//        System.out.println(Dl.deleteEnd());
//        Dl.printLL();
//        System.out.println(Dl.getSize());
//
//
//        System.out.println(Dl.deletePosition(1));
//        Dl.printLL();
//        System.out.println(Dl.getSize());

        // Circular singly lists
//        CircularList Cl=new CircularList();
//
//        Cl.insertFirst(7);
//        Cl.insertFirst(6);
//        Cl.insertFirst(4);
//        Cl.insertFirst(3);
//        Cl.printLl();
//        System.out.println("Size: "+Cl.getSize());
//
//        Cl.insertEnd(8);
//        Cl.printLl();
//        System.out.println("Size: "+Cl.getSize());
//
//        Cl.insertPosition(5,2);
//        Cl.printLl();
//        System.out.println("Size: "+Cl.getSize());
//
//        System.out.println( Cl.deleteFirst());
//        Cl.printLl();
//        System.out.println("Size: "+Cl.getSize());
//
//        System.out.println(Cl.deleteEnd());
//        Cl.printLl();
//        System.out.println("size: "+Cl.getSize());
//
//
//        System.out.println(Cl.deletePosition(1));
//        Cl.printLl();
//        System.out.println("size: "+Cl.getSize());
    }
}
