class Solution {
    public char findTheDifference(String s, String t) {
        int n=t.length();
        int d=s.length();
        char ans=0;
        for(int i=0;i<d;i++){
            ans^=s.charAt(i);
        }
        for(int j=0;j<n;j++){
            ans^=t.charAt(j);
        }
        return ans;
    }     
}
