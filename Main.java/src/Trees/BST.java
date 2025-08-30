package Trees;

import java.util.Stack;

public class BST {
    public BST(){

    }
    public class Node{
        private int value;
        private Node right;
        private Node left;
        private int height;

        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public boolean isEmpty(){
        return root==null;
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
           node=new Node(value);
           return node;
        }
        if(value< node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    // this is for sorted array of elements later we use the self balancing trees(AVL trees)
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void  populateSorted(int[] nums,int start,int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }
    public void display(){
        display(root,"Root node : ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");
    }
    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void PreOrderIterative(Node root){
        Stack<Node>  stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            System.out.print(node.value + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.value + " ");
            curr = curr.right;
        }
    }

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
    public void postorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
    }
}


// The problem with the BST if all the elements are in increasing order then if we take the root node as the first one then it takes O(n) time for searching
// instead of the O(logn) which completely violates the tree property ,we will use here the self-balancing trees like AVL trees
// every node of a tree should have the difference between the left and right subtrees either -1,0,1.
