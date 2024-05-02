//https://www.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null)
        {
            a.add(-1);
            return a;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())
        {
            Node t=q.poll();
            
            if(t==null)
            {
                a.add(-1);
            }
            else
            {
                a.add(t.data);
                q.offer(t.left);
                q.offer(t.right);
            }
        }
        return a;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        if(A.get(0)==-1)
        {
            return null;
        }
        Node root = new Node(A.get(0));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        for(int i=1;i<A.size();i+=2)
        {
            Node temp=q.poll();
            
            if(A.get(i)==-1)
            {
                temp.left = null;
            }
            else
            {
                Node newNode = new Node(A.get(i));
                temp.left = newNode;
                q.offer(newNode);
            }
            
            if(A.get(i+1)==-1)
            {
                temp.right = null;
            }
            else
            {
                Node newNode = new Node(A.get(i+1));
                temp.right = newNode;
                q.offer(newNode);
            }
        }
        
        return root;
    }
};class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null)
        {
            a.add(-1);
            return a;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())
        {
            Node t=q.poll();
            
            if(t==null)
            {
                a.add(-1);
            }
            else
            {
                a.add(t.data);
                q.offer(t.left);
                q.offer(t.right);
            }
        }
        return a;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        if(A.get(0)==-1)
        {
            return null;
        }
        Node root = new Node(A.get(0));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        for(int i=1;i<A.size();i+=2)
        {
            Node temp=q.poll();
            
            if(A.get(i)==-1)
            {
                temp.left = null;
            }
            else
            {
                Node newNode = new Node(A.get(i));
                temp.left = newNode;
                q.offer(newNode);
            }
            
            if(A.get(i+1)==-1)
            {
                temp.right = null;
            }
            else
            {
                Node newNode = new Node(A.get(i+1));
                temp.right = newNode;
                q.offer(newNode);
            }
        }
        
        return root;
    }
};