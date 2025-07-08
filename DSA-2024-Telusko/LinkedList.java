

public class LinkedList {
    static class Node {
        int data;
        Node next;
        
        // constructor 
        public Node(int data){
            this.data = data;
            next=null;
        }
    }

    //head,  5, 4, 6, 7
    Node head = null;

     public void add(int data){
            Node newNode = new Node(data);

            Node current = head; // contains the previous node

       if(head == null){
            head = newNode; // pointing head to 1st node
        }else {
             // traversing to last element 
             // loop used because when we add element in the middle , we need to update upto last;
            while(current.next != null){ 
                current = current.next; // saving the next node address here      
            }
            // updating current with previous node.
            current.next = newNode; 
        }
    }
}
