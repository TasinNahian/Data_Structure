public class LinkedList {
    Node head;

    static class Node //make the class to static otherwise static class cannot call non static class
    {
        int data;
        Node next;
        
        Node(int d)
        {
            this.data = d;
            next = null;
        }
    }

    public void printList()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.head = new Node(5);
        Node second = new Node(7);
        Node third = new Node(10);

        //Connecting the next node to the other nodes
        list.head.next = second;
        second.next = third;

        list.printList();
    }


}
/* 
Time Complexity	 Worst Case	   Average Case
Search	           O(n)	          O(n)
Insert	           O(1)	          O(1)
Deletion	       O(1)           O(1) 
*/