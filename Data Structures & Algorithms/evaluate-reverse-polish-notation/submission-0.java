class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        List<String> operators = List.of("+", "-", "*", "/");

        for (String t : tokens) {
            if (operators.contains(t) == false) {
                s.push(Integer.valueOf(t));
            } else {
                int op2 = s.pop();
                int op1 = s.pop();
                if (t.equals("+")) {
                    op1 += op2;
                } else if (t.equals("-")) {
                    op1 -= op2;
                } else if (t.equals("*")) {
                    op1 *= op2;
                } else {
                    op1 /= op2;
                }
                s.push(op1);
            }
        }

        return s.pop();
    }
}
