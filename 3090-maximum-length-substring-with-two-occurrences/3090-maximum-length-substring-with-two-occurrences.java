class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0,r=0,ml=0;
        Map<Character,Integer>map=new HashMap<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            r++;
            while (map.get(ch) > 2) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            ml=Math.max(ml,r-l);
        }

       return ml; 
    }
}