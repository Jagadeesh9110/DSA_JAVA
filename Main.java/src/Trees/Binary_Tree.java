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
    public boolean pathSum(int target){
        return hasPathSum(root,target);
    }
    private boolean hasPathSum(Node node,int rem){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
             return rem==node.val;
        }
        return hasPathSum(node.left,rem-node.val) || hasPathSum(node.right,rem-node.val);

    }

    public List<List<Integer>> pathSum(Node root, int targetSum) {
         List<List<Integer>> res=new ArrayList<>();
        return res;
    }
    private void pathSum(Node node,int rem,List<Integer> cur,List<List<Integer>> res){
        if(node==null){
            return;
        }
        cur.add(node.val);
        if(node.left==null && node.right==null && rem==0) {
            res.add(new ArrayList<>(cur));
        }else{
            pathSum(node.left,rem-node.val,cur,res);
            pathSum(node.right,rem-node.val,cur,res);
        }
        cur.remove(cur.size()-1);
    }

    public Node lowestCommonAncestor(Node p,Node q){
        return lowestCommonAncestor(root,p,q);
    }
    private boolean hasNode(Node root,Node node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        return hasNode(root.left,node) || hasNode(root.right,node);
    }
    private Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root==null || p==null || q== null){
            return null;
        }
        // this will give O(n^2) time complexity.
        // this are checking if one node is present on left and another one is right
//        if(hasNode(root.left,p) && hasNode(root.right,q)){
//            return root;
//        }
//        if(hasNode(root.left,q) && hasNode(root.right,p)){
//            return root;
//        }
//        Node left=lowestCommonAncestor(root.left,p,q);
//        Node right=lowestCommonAncestor(root.right,p,q);

        // O(n) time and space approach.
//        List<Node> path1=new ArrayList<>();
//        List<Node> path2=new ArrayList<>();
//
//        if(!findPath(root,path1,p) || !findPath(root,path2,q)){
//            return null;
//        }
//        Node lca=null;
//        int i=0;
//        while(i<path1.size() && i<path2.size()){
//            if(path1.get(i)==path2.get(i)){
//                lca=path1.get(i);
//            }else{
//                break;
//            }
//            i++;
//        }
//        return lca;

        // O(n) time and O(h) space, where h is height of the subtree.
        if(root==p || root==q){
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if(left!=null && right!=null){
            return root;
        }

         if(left!=null){
             return left;
         }
         return right;
    }
    private boolean findPath(Node root,List<Node> path,Node n){
       if(root==null){
           return false;
       }
       path.add(root);
       if(root==n || findPath(root.left,path,n) || findPath(root.right,path,n)){
          return true;
       }
        path.remove(path.size() - 1);
       return false;
    }


//    public int maxPathSum(){
//        List<List<Integer>> allPaths=new ArrayList<>();
//        maxPathSum(root,new ArrayList<>(),allPaths);
//        int max=Integer.MIN_VALUE;
//        int n=allPaths.size();
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int val:allPaths.get(i)){
//                sum+=val;
//            }
//            max=Math.max(max,sum);
//        }
//        return max;
//    }
//    private void maxPathSum(Node node,List<Integer> cur,List<List<Integer>> allPaths){
//         if(node==null){
//             return
//         }
//    }

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
