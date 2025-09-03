class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int n=heights.length;
         int [] expected=new int[n];
        for(int i=0;i<n;i++)
        {
            expected[i]=heights[i];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[i]>heights[j])
                {
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(heights[i]!=expected[i])
            {
                count = count+1;
            }
        }
       return count;
    }
}