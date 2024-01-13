public class BinarySearchTree1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else {
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static int MaxDepth(Node root){
        if (root==null){
            return 0;
        }
        int left=MaxDepth(root.left);
        int right=MaxDepth(root.right);
        return Math.max(left,right)+1;

    }

    public static void main(String[] args) {
        int val[]={4,7,2,3,1,8,5};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(MaxDepth(root));
    }
}
