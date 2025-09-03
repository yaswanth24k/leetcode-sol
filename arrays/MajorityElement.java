class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count=count+1;
                    if(count>=n/2)
                    {
                        return nums[i];
                    }
                }
            }
            count =0;
        }
        return nums[0];
    }
}