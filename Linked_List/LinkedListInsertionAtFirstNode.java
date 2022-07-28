// Instertion at first node in LinkedList
public class LinkedListInsertionAtFirstNode
{
	Node head;
	int count = 0;

	// creation of nodes
	class Node
	{ 
		int data;
		Node next;

		Node(int d)
		{
			this.data = d;
			next = null;
		}

	}

	//push into linked list
	public void push(int new_data)
	{
		if(head == null)
		{
			head = new Node(new_data);
		}
		else
		{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		}
	}
	public void printList()
	{
		Node n = head;
		
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
			count++;
		}
	}
	public static void main(String args [])
	{
		LinkedListInsertionAtFirstNode list = new LinkedListInsertionAtFirstNode();
		//as it is LinkedList insertion therefore every value 
		//will be inserted fist and first value inserted will be 
		//at the last
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);

		list. printList();
		System.out.println();
		System.out.println(list.count);


	}
}