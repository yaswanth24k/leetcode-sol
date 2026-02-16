class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
       while(i<m&&j<n)
        {
            if(nums1[i]<nums2[j]&&i<=m-1)
            {
                res[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                if(j<=n-1)
                {
                res[k]=nums2[j];
                k++;
                j++;
                }
            }
        }
        while(i<m)
        {
            res[k++]=nums1[i];
            i++;
        } 
        while(j<n)
        {
            res[k++]=nums2[j];
            j++;
        }
           
        for(i=0;i<nums1.length;i++)
        {
            nums1[i]=res[i];
        }
        }
 
    }        
