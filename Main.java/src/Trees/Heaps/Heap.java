package Trees.Heaps;

import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
     public static void main(String[] args) {

     }
     private ArrayList<T> list;
     public Heap(){
         list=new ArrayList<>();
     }

     private void swap(int first,int second){
         T temp=list.get(first);
         list.set(first,list.get(second));
         list.set(second,temp);
     }
     private int parent(int index){
         return (index-1)/2;
     }
     private int left(int index){
         return 2*index +1;
     }
     private int right(int index){
         return 2*index +2;
     }

     public void insert(T value){
         list.add(value);
         upheap(list.size()-1);
     }
     private void upheap(int index){
         if(index==0){
             return;
         }
         int p=parent(index);
         if(list.get(index).compareTo(list.get(p))<0){
             swap(index,p);
             upheap(p);
         }
     }

     public T remove() throws Exception{// it will throw an exception if we try to remove from the empty list;
       if(list.isEmpty()){
           throw new Exception("Removing from an empty heap");
       }
       T temp=list.get(0);
        T last=list.get(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
       return temp;
     }

    private void downHeap(int index) {
         int min=index;
         int left=left(index);
         int right=right(index);
         if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
             min=left;
         }
        else if(right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        if(min!=index){
            swap(min,index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapsort() throws Exception{
         ArrayList<T> data=new ArrayList<>();
         while(!list.isEmpty()){
             data.add(this.remove());

         }
         return data;
    }
}
