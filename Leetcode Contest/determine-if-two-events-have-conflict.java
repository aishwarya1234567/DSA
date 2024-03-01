//https://leetcode.com/contest/weekly-contest-316/problems/determine-if-two-events-have-conflict/

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        boolean first = event1[1].compareTo(event2[0]) < 0;        
        boolean second = event2[1].compareTo(event1[0]) < 0;

        return !first && !second;
    }
}