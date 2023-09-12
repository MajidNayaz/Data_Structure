public class Runner {
    public static void main(String[] args) {
     DoublyLinkedList dll = new DoublyLinkedList();
    
     dll.headNode  = new Node(345);
      
     Node secondNode = new Node(34);

     Node therdNode = new Node(234);

    dll.headNode.Next = secondNode;
    secondNode.Next = therdNode;
    therdNode.prev = secondNode;
    secondNode.prev = dll.headNode;
    

    dll.insertAtBeginning(654);
    dll.insertAtBeginning(12345);
    System.out.println("show all nodes "+ dll);
    }
}