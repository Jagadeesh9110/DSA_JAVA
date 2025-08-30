package Trees;

public class segmentTree {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
    }
    private static class Node{
     int data;
     int startInterval;
     int endInterval;
     Node left;
     Node right;
     public Node(int startInterval,int endInterval){
       this.startInterval=startInterval;
       this.endInterval=endInterval;
     }
    }
 private Node root;
 public segmentTree(int[] arr){
     this.root=constructTree(arr,0,arr.length-1);
 }

    private Node constructTree(int[] arr,int start,int end) {
      if(start==end){
          //leaf node
          Node leaf=new Node(start,end);
          leaf.data=arr[start];
          return leaf;
      }
      Node node=new Node(start,end);
      int mid=(start+end)/2;
      node.left=this.constructTree(arr,start,mid);
      node.right=this.constructTree(arr,mid+1,end);
      node.data=node.left.data+node.right.data;
      return node;
    }
    public void display(){
      display(root);
    }
    private void display(Node node){
      String str="";
      if(node.left!=null){
          str+="Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] and data: "+node.left.data+ " + => ";
      }else{
          str+="No left child";
      }

      str+="Interval=["+node.startInterval+"-"+node.endInterval+"] and data: "+node.data+ " + <= ";

        if(node.right!=null){
            str+="Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] and data: "+node.right.data;
        }else{
            str+="No Right child";
        }
        System.out.println(str+'\n');

        //call recursion
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }

    // query
    public int query(int Qsi,int Qei){
     return this.query(this.root,Qsi,Qei);
    }
    private int query(Node node,int Qsi,int Qei){
      if(node.startInterval>=Qsi && node.endInterval<=Qei){
         return node.data;
      }else if(node.startInterval>Qei && node.endInterval<Qsi){
          return 0;
      }else{
          return this.query(node.left,Qsi,Qei)+this.query(node.right,Qsi,Qei);
      }
    }

    // update
    public void update(int index,int value){
     this.root.data=update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
     if(index>=node.startInterval && index<=node.endInterval){
         if(index==node.startInterval && index==node.endInterval){
             node.data=value;
             return node.data;
         }else{
             int leftAns=update(node.left,index,value);
             int rightAns=update(node.right,index,value);
             node.data=leftAns+rightAns;
             return node.data;
         }
     }
     return node.data;
    }
}
