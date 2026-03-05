class Solution {
    public String trimTrailingVowels(String s) {
        int end=s.length()-1;
        while(end>=0 && isvowel(s.charAt(end)))
        {
            end--;
        }
        return s.substring(0,end+1);
    }
    boolean isvowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}