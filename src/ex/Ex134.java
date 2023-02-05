package ex;

import algo.Stack;

public class Ex134 {

    public static void main(String[] args) {

        //Check if the parentheses are balanced
        Stack<String> parentheses = new Stack<>();
        String s = "[()]{}{[()()]())";

        System.out.println("\n" + isBalanceParentheses(parentheses, s));
    }

    private static boolean isBalanceParentheses(Stack<String> parentheses, String s) {

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            System.out.print(s1);
            parentheses.push(s1);
            if (s1.equals(")")) {
                parentheses.pop();
                String pop = parentheses.pop();
                if (!pop.equals("(")) return false;
            }
            if (s1.equals("]")) {
                parentheses.pop();
                String pop = parentheses.pop();
                if (!pop.equals("[")) return false;
            }
            if (s1.equals("}")) {
                parentheses.pop();
                String pop = parentheses.pop();
                if (!pop.equals("{")) return false;
            }
        }
        return true;
    }
}
