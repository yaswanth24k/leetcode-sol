class Solution {
    public int arrangeCoins(int n) {
        if(n<=1)
        {
            return 1;
        }
      int  rem=n;
      int i=1;
      while(rem>=i)
      {
        rem=rem-i;
        i++;
      }
      return i-1;  
    }
}