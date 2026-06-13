class Solution {
    public int romanToInt(String s) {
        int res=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int cur=value(s.charAt(i));
            if(cur<prev)
            {
                res=res-cur;
            }
            else
            {
                res=res+cur;
            }
            prev=cur;
        }
        return res;
    }

    public int value(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default :return 0;
        }
    }
}
