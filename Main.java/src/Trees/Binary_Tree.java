package src.Trees;

import java.util.*;

public class Binary_Tree {
    private Node root;
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private void populate(Scanner in){
        System.out.println("Enter the root node val: ");
        int val=in.nextInt();
        root=new Node(val);
        populate(in,root);
    }
    private void populate(Scanner in,Node node){
        System.out.println("Do you want to enter the left node of "+node.val);
        boolean left= in.nextBoolean();
        if(left){
            System.out.println("Enter the left child of Node :"+node.val);
            int val=in.nextInt();
            node.left=new Node(val);
            populate(in,node.left);
        }
        System.out.println("Do you want to enter the right node of "+node.val);
        boolean right=in.nextBoolean();
        if(right){
            System.out.println("Enter the right child of Node :"+node.val);
            int val=in.nextInt();
            node.right=new Node(val);
            populate(in,node.right);
        }
    }
    private void display(){
        display(root,"");
    }
    private void display(Node node,String s){
       if(node==null){
           return;
       }
        System.out.println(s+node.val);
        display(node.left,s+'\t');
        display(node.right,s+'\t');
    }
    public List<Integer> preorder(){
        List<Integer> res=new ArrayList<>();
        preOrderTraversal(root, res);
        return res;
    }

    private void preOrderTraversal(Node node,List<Integer> list){
       if(node==null){
           return;
       }
       list.add(node.val);
       preOrderTraversal(node.left,list);
       preOrderTraversal(node.right,list);
    }
    public List<Integer> inorder(){
        List<Integer> res=new ArrayList<>();
        inOrderTraversal(root,res);
        return res;
    }
    private void inOrderTraversal(Node node,List<Integer> list){
        if(node==null) {
            return;
        }
        inOrderTraversal(node.left,list);
        list.add(node.val);
        inOrderTraversal(node.right,list);
    }
    public List<Integer> postorder(){
        List<Integer> res=new ArrayList<>();
        postOrderTraversal(root, res);
        return res;
    }

    private void postOrderTraversal(Node node,List<Integer> list){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left,list);
        postOrderTraversal(node.right,list);
        list.add(node.val);
    }

    // iterative traversals
    public List<Integer> inorderIterative(){
         return inorderIterativeTraversal(root);
    }
    private List<Integer> inorderIterativeTraversal(Node root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=root;

        while( cur!=null  || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            res.add(cur.val);
            cur=cur.right;
        }
        return res;
    }

    public List<Integer> preOrderIterative(){
        return preOrderIterativeTraversal(root);
    }
    private List<Integer> preOrderIterativeTraversal(Node root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            res.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null) {
                stack.push(node.left);
            }
        }
        return res;
    }

    public List<Integer> postOrderIterative(){
        return postOrderIterativeTraversal(root);
    }
    private List<Integer> postOrderIterativeTraversal(Node root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            if(node.left!=null) {
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
            res.add(node.val);
        }
        return res;
    }

    public List<List<Integer>> levelOrder(){
        return levelOrderTraversal(root);
    }
    private List<List<Integer>> levelOrderTraversal(Node node){
        List<List<Integer>> res=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            List<Integer> cur=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node temp=queue.poll();
                cur.add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            res.add(cur);
        }
        return res;
    }

    public int maxDepth(){
        return maxDepth(root);
    }
    private int maxDepth(Node node){
        if(node==null){
            return 0;
        }
        int val=Math.max(maxDepth(node.left),maxDepth(node.right));
        return 1+val;
    }
    public boolean isSameTree(Node p,Node q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isValidBinarySearchTree(){
        return isValidBinarySearchTree(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidBinarySearchTree(Node node,long min,long max){
        if(node==null){
            return true;
        }
        if((min!=Long.MIN_VALUE && node.val<=min) || (max!=Long.MAX_VALUE && node.val>=max) ){
            return false;
        }

        return isValidBinarySearchTree(node.left,min,node.val) && isValidBinarySearchTree(node.right,node.val,max);
    }

    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          Binary_Tree tree=new Binary_Tree();
          tree.populate(in);
          tree.display();

          tree.preorder();
          tree.inorder();
          tree.postorder();

    }
}
