import com.sun.source.tree.Tree;

public class TreeTraversal
{
//    static class Node
//    {
//        int key;
//        Node left, right;
//        Node(int item)
//        {
//            key = item;
//            left = right = null;
//        }
//    }

    //===========================

    Node root;
    TreeTraversal()
    {
        root = null;
    }

    void printPostOrder(Node node)
    {
        if(node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    void printInOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);

    }
    void printPreOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    void printPostOrder()
    {
        printPostOrder(root);
    }
    void printInOrder()
    {
        printInOrder(root);
    }
    void printPreOrder()
    {
        printPreOrder(root);
    }

    public static void main(String[] args)
    {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostOrder();
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder();
        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreOrder();
    }
}
