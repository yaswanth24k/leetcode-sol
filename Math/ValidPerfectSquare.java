class Solution {
    public boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            long sqr=(long) mid*mid;
            if(sqr==num)
            {
                return true;
            }
            else if(sqr<num)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
}