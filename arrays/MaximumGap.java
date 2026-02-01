
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int gap=0;
        if(nums.length<2)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]>gap)
            {
                gap=nums[i+1]-nums[i];
            }
        }
        return gap;
    }
}