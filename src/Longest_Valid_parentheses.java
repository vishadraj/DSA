public class Longest_Valid_parentheses {
    /**
     * Given a string, find the length of the longest valid parentheses substring
     *
     * @param s the string to be checked
     * @return The length of the longest valid parentheses substring.
     */
    public static int longestValidParentheses(String s) {
        int res = 0;
        int dp[] = new int[s.length() + 1];
        for (int i = 1; i < s.length(); i++) {
            int j = i - dp[i] - 1;
            if (j >= 0 && s.charAt(j) == '(' && s.charAt(i) == ')') {
                dp[i + 1] = dp[i] + dp[j] + 2;
            }
            res = Math.max(res, dp[i + 1]);
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        longestValidParentheses("(()");
    }
}
