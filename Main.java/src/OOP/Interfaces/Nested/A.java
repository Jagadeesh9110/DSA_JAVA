package OOP.Interfaces.Nested;


class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        if(num%2==0){
            return true;
        }
        return false;
    }
}
public class A {
    // nested interface

    public interface NestedInterface{
        boolean isOdd(int num);
    }


}
