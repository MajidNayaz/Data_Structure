class Node {
    int data;
    Node left, right;
    int height;

    Node(int data) {
        this.data = data;
        left = right = null;
        height = 1;
    }
}
public class Avl_T {

    Node root;
    
    int height(Node node){
        if(node==null)
        return 0;
        return node.height;
    }

    int max(int a,int b){
        return a>b ? a:b;
    }
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = max(height(x.left),height(x.right))+1;
        y.height = max(height(y.left),height(y.right))+1;

        return x;
    }

    Node leftRotate(Node y) {
        Node x = y.right;
        Node T2 = x.left;

        x.left = y;
        y.right = T2;

        x.height = max(height(x.left), height(x.right))+1;
        y.height = max(height(y.left), height(y.right))+1;
         
        return x;
    }

    int getBalance(Node node){
        if(node == null){
            return 0;
        }
        return height(node.left)-height(node.right);
    }

    Node inserNode(Node root, int key) {
        if(root==null){
            return new Node(key);
                }
        if(root.data>key){
            root.left = inserNode(root.left, key);
        }else if(root.data<key){
            root.right = inserNode(root.right, key);
        }else{
            return root;
        }

        root.height = max(height(root.left), height(root.right))+1;
        
        int balance = getBalance(root);

        if(balance>1){
            if(key>root.left.data){
                root.left = leftRotate(root.left);
            }
            return rightRotate(root);
        }
        if(balance<1){
            if(key<root.right.data){
              root.right = rightRotate(root.right);
            }
            return leftRotate(root);
        }
        return root;

    }

    void perOrder(Node node) {
        //root left right
        System.out.println(node.data);
        perOrder(node.left);
        perOrder(node.right);
    }

    public static void main(String[] args) {
     AVL_T av = new AVL_T();
     av.root = av.insert(av.root, 34);
     av.insert(av.root, 24);
     av.insert(av.root, 14);
     av.preOrder(av.root);  
    }
}