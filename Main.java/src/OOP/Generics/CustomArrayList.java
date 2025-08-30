package OOP.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int Default_size=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[Default_size];

    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;

    }

    private boolean isFull() {
        return size==data.length;
    }

    public void resize(){
        int[] temp=new int[data.length *2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
     data=temp;

    }
  public int remove(){
        int removed =data[--size];
        return removed;
  }
  public int get(int index){
        return data[index];
  }
  public int size(){
        return size;
  }
  public void set(int index,int value){
        data[index]=value;
  }

    @Override
    public String toString() {
        return "CustomArrayList{"+"data"+ Arrays.toString(data)+", size="+size+" }";
    }

    public static void main(String[] args) {
        // Actually we will create from the inbuilt arraylist we will use the methods and variables
    //    ArrayList list=new ArrayList();

        // we will create the custom arraylist
        CustomArrayList list=new CustomArrayList();
        list.add(5);
        list.add(2);
        list.add(6);
        System.out.println(list.size());// size is not the actuall size of the internal array , it is data we are adding
        System.out.println(list);
        list.set(2,8);
        System.out.println(list);
//        list.add("h");

        // we will have the problem with our custom array list , which is we are storing the only integer remaining we cannot
        // we can solve the problem using the generics (by using the template type like inbuilt ArraysList by mentioning the parameter type




    }
}
