//https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int i=0,j=n-1,count=0;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}
