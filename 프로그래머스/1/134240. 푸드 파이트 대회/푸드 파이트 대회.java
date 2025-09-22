class Solution {
    public String solution(int[] food) {
        String left = "";
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for (int k = 0; k < cnt; k++) {
                left += (char) ('0' + i); // 문자열 덧붙이기(비효율적)
            }
        }
        String ans = left + "0";
        for (int i = food.length - 1; i >= 1; i--) {
            int cnt = food[i] / 2;
            for (int k = 0; k < cnt; k++) {
                ans += (char) ('0' + i);
            }
        }
        return ans;
    }
}