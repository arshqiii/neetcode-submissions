class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> resMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if (resMap.get(sorted) == null) {
                resMap.put(sorted, new ArrayList<>());
            }
            resMap.get(sorted).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>();
        for (ArrayList<String> value : resMap.values()){
            res.add(value);
        }

        return res;
    }
}
