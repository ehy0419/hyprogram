class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    ans[i] = i - j;
                    break; // 가장 가까운 왼쪽 동일 문자
                }
            }
        }
        return ans;
    }
}