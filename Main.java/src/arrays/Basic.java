package arrays;

public class Basic {
    public static void main(String[] args) {
        int[] array=new int[10];// here we are directly initializing  the array

        // Set of roll numbers
        int[] RollNo;// Declaring the array ,stored in Stack
        RollNo=new int[10];// object are created in heap
        System.out.println(RollNo[0]);
        // if we not assign the values it automatically created every element in the integer array as zero
        String[] names=new String[10];
        System.out.println(names[0]);
        // Here also same if we not assign it automatically assign the values with null
        // Important points
//        1-> array objects are  in heap
//        2-> heap objects are not continuous
//        3->DMA(memory will be allotted at run time )
//        4-> hence Array objects may be not continuous although the definition of array is continuous data in java it will happen(Depends on JVM)


    }
}
