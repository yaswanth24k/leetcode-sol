class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++)
        {
            res[i]=arr[i];
        }
        Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],rank);
                rank++;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            res[i]=map.get(res[i]);
        }
        return res;
    }
}
