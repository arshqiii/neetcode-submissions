class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for (String str : strs) {
            res += String.format("%d#%s", str.length(), str);
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            String decoded = str.substring(i, i + len);
            res.add(decoded);

            i += len;
        }

        return res;
    }
}
