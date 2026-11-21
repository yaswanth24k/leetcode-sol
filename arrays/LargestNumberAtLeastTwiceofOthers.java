class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<=n-1;i++){
            res[i]=nums[i];
        }
        Arrays.sort(nums);
        if(nums[n-2]*2>nums[n-1]){
            return -1;
        }
        for(int j=0;j<=n-1;j++){
            if(nums[n-1]==res[j]){
                return j;
            }
        }
        return -1;
    }
}
