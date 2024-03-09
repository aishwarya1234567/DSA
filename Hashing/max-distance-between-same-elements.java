//https://www.geeksforgeeks.org/maximum-distance-two-occurrences-element-array/

class Solution
{
    int maxDistance(int num[], int n)
    {
	// Your code here
	     int max = 0;
	     Map<Integer, Integer> hm = new HashMap<>();
	     
	     for(int i=0;i<n;i++)
	     {
	         if(hm.containsKey(num[i]))
	         {
	             int dist = i-hm.get(num[i]);
	             if(dist>max)
	                max=dist;
	         }
	         else
	         {
	             hm.put(num[i],i);
	         }
	     }
	     return max;
    }
}