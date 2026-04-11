import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int num:map.values())
        {
            if(num!=0)
            {
                return false;
            }
        }
        return true;
    }
}