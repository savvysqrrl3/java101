class Node{
    private double value;
    private Node next;

    public Node(double val, Node next){
        this.value = val;
        this.next = next;
    }

    public double getVal() {
        // System.out.println("This node's value is : " + value);
        return value;
    }
    public void setVal(double val) {
        this.value = val;
    }
    public Node getNext() {
        // System.out.println(next);
        return next;
    }
    public void setNext(Node someNode) {
        this.next = someNode;
    }
}