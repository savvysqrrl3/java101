class ListTester {
    public static void main(String[] args) {

        SinglyLinkedList mySll1 = new SinglyLinkedList(null);
        
        mySll1.add(10.31);
        mySll1.add(11.23);
        mySll1.add(12.25);
        mySll1.add(1.01);
        mySll1.printValues(); 

        mySll1.remove();
        mySll1.printValues();

    } 
}