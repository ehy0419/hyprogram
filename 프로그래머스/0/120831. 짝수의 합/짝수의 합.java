class Solution {
    public int solution(int n) {
        int answer = 0;
        // 나머지 조건문 활용
        for(int i=0; i<=n; i++) {
            if(i%2==0) {
                answer += i;
            }
        }
        return answer;
    }
}