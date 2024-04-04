//https://leetcode.com/problems/minimize-xor/

class Solution {
    public int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1);
        int b = Integer.bitCount(num2);

        int diff = a-b,cur=1;
        while(diff != 0)
        {
            if(a>b && (num1&cur)!=0)
            {
                num1 ^= cur;
                diff--;
            }
            else if(a<b && (num1&cur)==0)
            {
                num1 |= cur;
                diff++;
            }

            cur<<=1;
        }
        return num1;
    }
}