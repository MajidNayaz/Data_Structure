public class BST {

    static class Node {
        int data;
        Node right;
        Node left; 
    Node(int data){
        this.data=data;
        right = left = null;
    }
    }
    /*
     1 - Insertion 
     2 - Traversal
     3 - seraching 
     */

    public static Node Insert(Node node, int data){
        if(node==null){
            node = new Node(data);
            return node;
        }
        if(node.data>data){
            node.left = Insert(node.left,data);
        }
        if(node.data<data){
            node.right = Insert(node.right, data);
        }
        return node;
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        // left root right
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void postOrder (Node node){
        if(node == null ){
            return;
        }
        // left right root
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+ " ");
    }
    public static void preOrder(Node node){
        if(node == null ){
            return;
        }
        // root left right
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    public static boolean serach(Node node, int value){
        if(node== null){
            return false;
        }
        if(node.data == value){
            return true;
        }
        if(node.data<value){
          return serach(node.right, value);
        }else{
            return serach(node.left, value);
        }
    }

      
    public static void main(String[] args) throws Exception {
  

        Node root = null;
        root =  Insert(root, 34);
        Insert(root, 12);
        Insert(root, 40);
        Insert(root, 60);
        System.out.println("InOrder Traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("Post Order Traversal :");
        postOrder(root);
        System.out.println();
        System.out.println("Pre Order Traversal: ");
        preOrder(root);

        System.out.println();
        int x = 60;
        if(serach(root, x)){
            System.out.println(x + " Found");
        }
        else{
            System.out.println(x+" Not Found");
        }
        if(serach(root, 41)){
            System.out.println(41+" Found");

        }else{
            System.out.println(41 + " Not Found");
        }
         
      
    }
}


/*
35
      34
    /   \
    12   40
            \
             60
 */
