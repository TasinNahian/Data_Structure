public class LinkedListWithPushInsertAppend {
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
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data)
    {
        if(prev_node == null)
        {
            System.out.println("Previous Node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;  
    }
    public void append(int new_data)
    {
        if(head == null)
        {
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = null;
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void printList()
    {
        Node n = head;
        while(n != null);
        {
            System.out.print(n.data +" ");
            n = n.next;
        }
    }
    public static void main(String args [])
    {
        LinkedListWithPushInsertAppend list = new LinkedListWithPushInsertAppend();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        list.printList();

        System.out.println(" -------------------The List before any inserstion-----------------");


        list.push(001);
        System.out.println(" -------------------The List after push()-----------------");
        list.printList();


    }
}
