class Node {            //class Node
    int data;
    Node right;
    Node left;
    Node (int value){
        this.data=value;
        right = left = null;
    }
}

public class BST_Oprations {
    Node root;

    BST_Oprations(){
        root = null;
    }

    Node insertNode(Node node, int value){                  //function for inserting new Node in BST
        if(node==null){
           node = new Node(value);
           return node;
        }
        if(value<node.data){
            insertNode(node.left, value);
        }else if(value>node.data){
            insertNode(node.right, value);
        }
        return node;
    }

    Node searchNode (Node node,int value){                        //function for serachig a value in BST
        if(node ==null || node.data == value){
            return root;

        }
        if(value>node.data){
            return searchNode(node.right, value);
        }else{
            return searchNode(node.left, value);
        }
    }

    void traversal(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        traversal(node.left);
        traversal(node.right);
    }


    public static void main(String[] args) {
        BST_Oprations tree = new BST_Oprations();

        tree.insertNode(tree.root, 12);
        tree.insertNode(tree.root,34);
        tree.insertNode(tree.root, 18);
        tree.insertNode(tree.root,54);
        tree.traversal(tree.root);
    }



}