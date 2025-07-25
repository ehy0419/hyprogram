class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n); // 제곱근을 구하고 long으로 형 변환

        // 제곱근의 제곱이 n과 같다면 다음 제곱수를 반환
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }

        // 제곱수가 아니면 -1 반환
        return -1;
    }
}