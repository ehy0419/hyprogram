class Solution {
    public int solution(int a, int b, boolean flag) {
        // flag 값에 따라 다른 연산을 수행하는 조건문
        if (flag) { // flag가 true일 경우
            return a + b;
        } else { // flag가 false일 경우
            return a - b;
        }
    }
}