public class DoublyLinkedList {

    Node headNode;
    
    void showNode(){

        Node temp = headNode;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.Next;
        }
    }
    void insertAtBeginning (int data){
        Node NodeAtBeg = new Node(data);
        NodeAtBeg.Next = headNode;
        headNode.prev = NodeAtBeg;
        headNode = NodeAtBeg;
        
    }
}