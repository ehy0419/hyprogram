class Solution {
    public int solution(int n) {
        int answer = 0;

        // n이 홀수일 경우
        if (n % 2 != 0) {
            // n 이하의 모든 양의 홀수들의 합을 계산
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } 
        // n이 짝수일 경우
        else {
            // n 이하의 모든 양의 짝수들의 제곱의 합을 계산
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }

        return answer;
    }
}