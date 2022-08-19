public class BinaryTree
{
    public static class Jubayer //main gate //root >>> //left >>>2 >>>right =3
             // 1ta bashar naam hocche root

    {
        int maal;
        Jubayer left, right; //both right and left gate points to main gate

        Jubayer(int item)
        {
            maal = item;
            left = right = null;
        }
    }
    Jubayer root; //object

    BinaryTree(int key)
    {
        root = new Jubayer(key);
    }
    BinaryTree()
    {
        root = null;
    }
    public static void main( String [] args)
    {
        BinaryTree tree = new BinaryTree(); //piyon
        tree.root = new Jubayer(1);
        /* following is the tree after above statement

              1
            /   \
          null  null     */
        tree.root.left = new Jubayer(2);
        tree.root.right = new Jubayer(3);
        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
        tree.root.left.left = new Jubayer(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        tree.root.right.left = new Jubayer (5);
    }
}
