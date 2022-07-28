public class LinkedListInsertionAfterGivenNode {
    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        }
    }

    public void insertAfter(Node prev_node, int new_data)
    {
        //check if prev_node is null or not
        if(prev_node == null)
        {
            System.out.println("The previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next; // this step is necessary other wise all nodes after new nodes will be lost
        prev_node.next = new_node;
    }



    void printList()
    {
        Node n = head;
        while(n !=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[])
    {
        LinkedListInsertionAfterGivenNode list = new LinkedListInsertionAfterGivenNode();
        

        list.head = new Node(5);
        Node second = new Node(7);
        Node third = new Node(10);

        //Connecting the next node to the other nodes
        list.head.next = second;
        second.next = third;

        list.insertAfter(third, 122);

        list.printList();
    }
}
