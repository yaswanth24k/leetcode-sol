class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start=0;
        int end=nums.length-1;
       while(end>=start)
        {
           int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                
                
                    int left=mid;
                    int right=mid;
                    while(0<left&&nums[left-1]==target)
                    {
                        left--;
                    }
                    while(right+1<nums.length&&nums[right+1]==target)
                    {
                      right++;
                    }
                    return new int[]{left,right};
                
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
             start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}