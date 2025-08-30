package OOP.Generics;

import java.util.Arrays;
// https://docs.oracle.com/javase/tutorial/java/generics/index.html
public class CustomGenArrayList<T> {
    private Object[] data;
    private static int Default_size=10;
    private int size=0;

    public CustomGenArrayList() {
        this.data = new Object[Default_size];

    }

    public void add(T num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;

    }

    private boolean isFull() {
        return size==data.length;
    }

    public void resize(){
        Object[] temp=new Object[data.length *2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;

    }
    public T remove(){
        T removed =(T)data[--size];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{"+"data"+ Arrays.toString(data)+", size="+size+" }";
    }
 // Here T is a template type or parametrized type which we want to insert into the list
    // we are the Object type of data to store ,if we write T instead of Object in the above context it will give the compile-time error

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list=new CustomGenArrayList<>();
        for(int i=0;i<15;i++){
            list.add(3*i);
        }
        System.out.println(list);
    }

    // we can also restrict the type like to a  number only by using the wildCard

}
