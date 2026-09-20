class Solution {
    public long countCommas(long n) {
        long count=0;
        long divisor=1000;
        while(divisor<=n)
        {
            count+=n-divisor+1;
            divisor*=1000;
        }
        return count;
    }
}
