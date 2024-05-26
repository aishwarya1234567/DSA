public class Heap {
    static int[] arr = new int[100];
    static int size = 0;
    
    public static void insert(int elem){
        size=size+1;
        arr[size]=elem;
        
        int child=size;
        int parent=child/2;
        
        while(arr[child]>arr[parent] && parent>=1)
        {
            swap(child,parent);
            child=parent;
            parent=child/2;
        }
    }
    
    public static void peek()
    {
        if(size==0)
        {
            System.out.println("Heap empty!");
        }
        else
        {
            System.out.println(arr[1]);
        }
    }
    
    public static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public static void show()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static void delete()
    {
        swap(1,size);
        arr[size]=0;
        size--;
        
        int parent=1;
        int child1=2;
        int child2=3;
        
        while((arr[child1]>arr[parent] && child1<=size) || (arr[child2]>arr[parent] && child2<=size))
        {
            if(arr[child1]>arr[child2])
            {
                swap(child1,parent);
                parent=child1;
            }
            else
            {
                swap(child2,parent);
                parent=child2;
            }
            child1=2*parent;
            child2=2*parent+1;
        }
    }
    
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(5);
        heap.insert(15);
        heap.insert(18);
        heap.insert(150);
        heap.insert(250);
        heap.insert(50);
        heap.insert(100);
        heap.insert(10);
        // heap.show();
        // heap.peek();
        heap.delete();
        
        heap.show();
    }
}