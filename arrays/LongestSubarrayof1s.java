class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zerocnt=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zerocnt++;
            }
        
        while(zerocnt>1)
        {
            if(nums[left]==0)
            {
                zerocnt--;
            }
            left++;
        }
        maxlen=Math.max(maxlen,right-left);
    }
    return maxlen;
}
}