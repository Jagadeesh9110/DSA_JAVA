package OOP.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student obj1=new Student(10,88.222f);
        Student obj2=new Student(26,92.44423f);
        Student obj3=new Student(3,90.00000f);
        Student obj4=new Student(20,89.999999f);

//        if(obj1>obj2){// it will error because java don't know that  which property to compare in the all properties
//            System.out.println();
//        }// we can overcome this problem with the interface generic type comparable;

        // conventional way to do this
        if(obj1.compareTo(obj2)<0){// which means obj2 has more marks
            System.out.println("Obj2 has more marks");
        }
       else if(obj1.compareTo(obj2)==0){
            System.out.println("both objects  have the same marks");
        }
        else{
            System.out.println("Obj1 has more marks");
        }

        Student[] list= {obj1,obj2,obj3,obj4};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);// here it will use the compare methods and sort accordingly what we gave
        // we can also provide the comparator her only
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks-o2.marks);// here we are comparing using the marks and - represents the descending order
//            }
//        });
        Arrays.sort(list, (o1, o2) -> {
            return -(int)(o1.marks-o2.marks);// here we are doing like the above one using the lambda functions
        });
        System.out.println(Arrays.toString(list));

    }
}
