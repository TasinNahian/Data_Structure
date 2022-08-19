public class MinAndMaxElementInBST
{
    //to find the maximum value in a node

    static int findMax(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }
        int result = node.key;
        int leftResult = findMax(node.left);
        int rightResult = findMax(node.right);

        if (leftResult > result)
        {
            result = leftResult;
        }
        if(rightResult > result)
        {
            result = rightResult;
        }
        return result;

    }

    public static void main (String [] args)
    {
        MinAndMaxElementInBST minMaxTree = new MinAndMaxElementInBST();
        BinaryTreeInsertion tree = new BinaryTreeInsertion();
        Node root = new Node(9);
        tree.insert(root,5);
        tree.insert(root,10);
        tree.insert(root,55);
        tree.insert(root,12);
        tree.insert(root,2);
        tree.insert(root,5);
        tree.insert(root,6);
        System.out.println("Maximum element is " + minMaxTree.findMax(root) );
    }

}
