public class BinaryTree1 {
//    Maximum depth of binary tree
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
    static class BinaryTree{
        static int idx=-1;
        public static Node binaryTree(int node[]){
            idx++;
            if (node[idx]==-1){
                return null;
            }
            Node new_node=new Node(node[idx]);
            new_node.left=binaryTree(node);
            new_node.right=binaryTree(node);
            return new_node;
        }

    }
    public static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.binaryTree(node);
        preorder(root);
        System.out.println("height of the tree is  "+height(root));
    }
}
