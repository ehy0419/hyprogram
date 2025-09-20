class Solution {
    public String solution(String my_string) {
        int n = my_string.length();
        StringBuilder sb = new StringBuilder(n);
        for (int i = n - 1; i >= 0; i--) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}