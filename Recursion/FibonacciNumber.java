class Solution {
    public int fib(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }
}

class Solution {
    public int fib(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
       int[] res=new int[n];
        res[0]=1;
         res[1]=1;
       for(int i=2;i<=n-1;i++)
       {
            res[i]=res[i-1]+res[i-2];
       }
       return res[n-1];
    }
}
