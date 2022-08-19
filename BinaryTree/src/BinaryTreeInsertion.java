
public class BinaryTreeInsertion {

    //creation of Insert method
    public Node insert(Node root, int data)
    {
        //creation of a node to store the data
        Node newNode = new Node(data);

        //if root is null it will return newNode which means
        //that the newNode is the root node as no other node is present
        if(root == null)
        {
            return newNode;
        }
        //we will start from root so currentNode is root
        Node parentNode = null, currentNode = root;

        while(currentNode != null)
        {
            parentNode = currentNode;
            if(currentNode.key <= data)
            {
                currentNode = currentNode.right;
            }
            else
            {
                currentNode = currentNode.left;
            }
        }
        if(parentNode.key <= data)
        {
            parentNode.right = newNode;
        }
        else
        {
            parentNode.left = newNode;
        }

        return root;
    }

    //Driver
    public static void main (String [] args)
    {
        BinaryTreeInsertion tree = new BinaryTreeInsertion();
        Node root = new Node(9);
        tree.insert(root,5);
        tree.insert(root,10);
        tree.insert(root,55);
        tree.insert(root,12);
        tree.insert(root,2);
        tree.insert(root,5);
        tree.insert(root,6);
        TreeTraversal travTree = new TreeTraversal();
        travTree.printInOrder(root);
    }
}
