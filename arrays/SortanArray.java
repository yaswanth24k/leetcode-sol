class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }

        public void mergesort(int[] num,int left,int right)
        {
            if(left>=right)
            {
                return;
            }
            int mid=left+(right-left)/2;
            mergesort(num,left,mid);
            mergesort(num,mid+1,right);
            merge(num,left,mid,right);
        }
        public void merge(int[] num,int left,int mid,int right)
        {
            int[] temp=new int[right-left+1];
            int i=left;
            int j=mid+1;
            int k=0;
            while(i<=mid && j<=right)
            {
                if(num[i]<=num[j])
                {
                    temp[k]=num[i];
                    i++;
                    k++;
                }
                else
                {
                    temp[k]=num[j];
                    j++;
                    k++;
                }
            }
            while(i<=mid)
            {
                temp[k]=num[i];
                i++;
                k++;
            }
            while(j<=right)
            {
                temp[k]=num[j];
                j++;
                k++;
            }
            for(int h=0;h<temp.length;h++)
            {
                num[left+h]=temp[h];
            }

        }
    
}