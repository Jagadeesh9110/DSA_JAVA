package OOP.packages;

public class ObjectDemo {
    // object class is one of the classes in lang package
  //  object class is the root of the all classes which we are creating and using

    // in this object class there will be in-built methods also
  int num;
  float score;

    public ObjectDemo(int num,float score) {
        this.num = num;
        this.score=score;
    }// constructor function

    @Override
    public int hashCode() {
        return super.hashCode();
//         return num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num==((ObjectDemo)obj).num;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // string method used the string representation
    @Override
    public String toString() {
        return super.toString();
    }
    // called when garbage collection is needed
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(20,82.5f);
        System.out.println(obj.hashCode());// it will print some random value due to internal working
        // hash code is unique representation of an object by an number will used to represent the object whether the objects are same are different
        // in the overriding if we write return the num then it will print the whatever we are giving the num as input

        ObjectDemo obj2=obj;
        // here it will give the same hashcode as previous one so both objects are same

        ObjectDemo obj3=new ObjectDemo(12,68.44f);
        ObjectDemo obj4=new ObjectDemo(12,54.66f);

        if(obj3==obj4){
            System.out.println("obj3 is equal to obj4");

        }
        if(obj3.equals(obj4)){
            System.out.println("//////obj3 is equal to obj4");
        }

        // here difference is == is a comparitive it will say that two variables that we are comparing is pointing to the same object or not
        // whether .equals() is like a method actually check the content of it

        // here first if will not print second one will print

        System.out.println(obj.getClass()); // it will give the class of that obj is working
        //even if the object is referenced by a variable of a superclass or interface type.
        // we cannot override the getClass() method because it has final keyword,
        System.out.println(obj.getClass().getName());
        // getName() is method in the getClass()
    }
}
