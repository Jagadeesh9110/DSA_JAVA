package OOP.Cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{3,5,2,6,5,3};
    }
//    public Human(Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }
    public Object clone() throws CloneNotSupportedException{
        /// this is shallow copy
        return super.clone();
//        // this is deep copy
//        Human obj2=(Human)super.clone();// this is actually a shallow copy
//        // we will make the deep copy now
//   obj2.arr=new int[obj2.arr.length];
//   for(int i=0;i<obj2.arr.length;i++){
//       obj2.arr[i]=this.arr[i];
//   }
//        return obj2;
    }
 // if we want to use the clone method in a class then we should implement the cloneable interface to that class
}
