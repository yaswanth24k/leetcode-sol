class Solution {
    public boolean isPalindrome(String s) {
        String z=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left =0;
        int right=z.length()-1;
        while(left<right)
        {
            if(z.charAt(left)!=z.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
     return true;
    }
}