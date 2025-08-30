package OOP.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
//    int sum(int a,int b){
//        return a+b;
//    }
private int operate(int a,int b,Operation op){
        return op.operation(a,b);
}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+3);
        }
//        list.forEach((item)-> System.out.println(item*2));// it will print the elements of the list accordingly

        // we can write in a consumer way;
     Consumer<Integer> greet=(item)-> System.out.println(item*2);// here consumer is like a interface

     list.forEach(greet);

   // we want to do with multiple parameters then write for the interface

        System.out.println();
        Operation sum=(a,b)->a+b;
        Operation prod=(a,b)->a*b;
        Operation sub=(a,b)->a-b;
        Operation div=(a,b)->a/b;
       LambdaFunctions fun=new LambdaFunctions();
        System.out.println(fun.operate(5,3,sub));
    }
}

interface Operation{
    int operation(int a,int b);
}