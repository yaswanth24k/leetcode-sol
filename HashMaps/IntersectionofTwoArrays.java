import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        HashSet<Integer>result=new HashSet<>();
        for(int arr2:nums2)
        {
            if(set.contains(arr2))
            {
                result.add(arr2);
            }
        }
        int[] res=new int[result.size()];
        int j=0;
        for(int i:result)
        {
            res[j++]=i;
        }
        return res;
    }
}