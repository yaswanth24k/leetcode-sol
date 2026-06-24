class Solution {
    public int largestAltitude(int[] gain) {
        int cur=0;
        int max=0;
        for(int i:gain)
        {
            cur=cur+i;
            max=Math.max(max,cur);
        }
        return max;
    }
}
