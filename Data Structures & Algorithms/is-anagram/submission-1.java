class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), 0);
            } else{
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), 0);
            } else{
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }
        }

        boolean res = map1.equals(map2);

        return res;
    }
}
