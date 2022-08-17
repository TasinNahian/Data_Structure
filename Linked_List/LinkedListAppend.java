public class LinkedListAppend {
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
    void printList()
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
        LinkedListAppend list = new LinkedListAppend();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);

        list.printList();
    }
}
