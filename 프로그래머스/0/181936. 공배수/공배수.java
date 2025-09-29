class Solution {
    public int solution(int number, int n, int m) {
        // 하드코딩 버전: num과 n, m의 특정 값에 대해 결과를 직접 명시
        // 문제의 제한사항을 고려하면 모든 경우의 수를 하드코딩하는 것은 비현실적입니다.
        // 따라서 '하드코딩 버전'이라는 요청에 맞추기 위해,
        // 일반적인 해법 대신 if-else문을 사용한 직접적인 조건 검사 방식을 보여드립니다.
        // 실제로는 하드코딩 대신 `number % n == 0 && number % m == 0`와 같은 조건문을 사용하는 것이 올바른 풀이입니다.
        if (number % n == 0 && number % m == 0) {
            return 1; // number가 n과 m의 공배수이면 1을 반환
        } else {
            return 0; // 그렇지 않으면 0을 반환
        }
    }
}