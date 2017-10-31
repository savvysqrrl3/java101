class SinglyLinkedList{
    private Node head;
    
    // object constructor 
    public SinglyLinkedList(Node head){
        this.head = head;
    }

    // class method to traverse through the list and print the value of each node
    public void printValues() {
        if(this.head == null){
            System.out.println("There is no node, please run this method on a different SLL!"); 
        }
        
        else{
            Node pointer2 = this.head;
            while(pointer2 != null){
                System.out.println("Printing values:" + pointer2.getVal());
                pointer2 = pointer2.getNext();
            }
        }
    }

    // class method to create and add a new node to the end of the list 
    // could be improved by including an insert method as well 
    public void add(double value) {
        Node someNode = new Node(value, null);
        if(this.head == null){
            this.head = someNode;
        }
        else{
            Node pointer = this.head;
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(someNode);    
        }
        
    }

    // class method to remove the last node from the end of the list
    // this could be improved to delete a node with a specific value or position (Nth node) 
    public void remove() {
        if(this.head == null){
            System.out.println("There is no node to delete.");
        }
        else{
            Node current = this.head;
            Node previous = null;
            while (current.getNext() != null){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            System.out.println("Removing node...");
        }
    }
}