import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1!=nums[i+1])
            {
                int dif=nums[i+1]-nums[i];
                for(int j=1;j<dif;j++)
                {
                    res.add(nums[i]+j);
                }
            }
        }
        return res;
    }
}