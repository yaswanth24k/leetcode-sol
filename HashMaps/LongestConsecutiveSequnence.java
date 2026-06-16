class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int temp=1;
        for(int i=1;i<=nums.length-1;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            else if(nums[i]==nums[i-1]+1)
            {
                temp++;
            }
            else
            {
                max=Math.max(max,temp);
                temp=1;
            }
        }
        return Math.max(temp,max);
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
       int max=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int temp=num;
                int current=1;
            while(set.contains(temp+1))
            {
                temp++;
                current++;
            }
            max=Math.max(current,max);
        }
        }
        return max;
    }
}

