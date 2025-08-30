package OOP.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    @Override
    public String toString() {
     return marks+" ";//+rollNo;// it will sort according to the marks , if we add the rollNo it will accordingly both rollno and marks
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);// here i will specify which one compare

        // if diff==0 means both are equal
        // if diff<0 means o is bigger else o is smaller
        return diff;
    }

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
