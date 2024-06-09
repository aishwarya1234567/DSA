//https://www.geeksforgeeks.org/problems/symmetric-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return isMirror(root, root);
    }
    
    public static boolean isMirror(Node p, Node q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null || q==null || p.data != q.data)
        {
            return false;
        }
        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}
