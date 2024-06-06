//https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    if(node == null)
	    {
	        return res;
	    }
	    
	    if(isLeaf(node))
    	{
    	   res.add(node.data);
    	   return res;
    	}
    	
    	res.add(node.data);
	        
	    leftBorderTraversal(node,res);
	    printLeaves(node,res);
	    rightBorderTraversal(node,res);
	    
	    return res;
	}
	
	void leftBorderTraversal(Node node,ArrayList<Integer> res)
	{
	    node = node.left;
	    
	    while(node!=null)
	    {
	        if(!isLeaf(node))
	        {
	            res.add(node.data);
	        }
	        
	        if(node.left!=null)
	        {
	            node=node.left;
	        }
	        else
	        {
	            node=node.right;
	        }
	    }
	}
	
	void printLeaves(Node node,ArrayList<Integer> res)
	{
	    if(isLeaf(node))
	    {
	        res.add(node.data);
	        return;
	    }
	    
	    if(node.left != null)
	    {
	        printLeaves(node.left, res);
	    }
	    
	    if(node.right != null)
	    {
	        printLeaves(node.right, res);
	    }
	}
	
	void rightBorderTraversal(Node node,ArrayList<Integer> res)
	{
	    ArrayList<Integer> arr = new ArrayList<>();
	    node = node.right;
	    
	    while(node!=null)
	    {
	        if(!isLeaf(node))
	        {
	            arr.add(node.data);
	        }
	        
	        if(node.right!=null)
	        {
	            node=node.right;
	        }
	        else
	        {
	            node=node.left;
	        }
	    }
	    
	    for(int i=arr.size()-1;i>=0;i--)
	    {
	        res.add(arr.get(i));
	    }
	}
	
	boolean isLeaf(Node node)
	{
	    return (node.left == null && node.right == null);
	}
}
