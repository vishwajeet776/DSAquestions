public class BinaryTree2 {
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
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);

    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree vish=new BinaryTree();
        Node root=vish.binaryTree(node);
        postorder(root);
    }
}
