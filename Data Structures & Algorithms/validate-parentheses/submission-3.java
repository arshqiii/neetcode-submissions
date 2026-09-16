class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char par = s.charAt(i);

            if (par == '(' || par == '[' || par == '{') {
                st.push(par);
            } else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if (
                    (top == '[' && par == ']') ||
                    (top == '(' && par == ')') ||
                    (top == '{' && par == '}')
                ) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
