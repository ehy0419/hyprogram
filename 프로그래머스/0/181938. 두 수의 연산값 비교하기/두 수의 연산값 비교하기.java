class Solution {
    public int solution(int a, int b) {
        // 첫 번째 연산: 두 정수 a와 b를 문자열로 변환하여 이어 붙인 후, 다시 정수로 변환합니다.
        // "" + a는 a를 자동으로 문자열로 변환합니다.
        // "" + a + b는 두 문자열을 이어 붙입니다.
        // Integer.parseInt() 메서드를 사용해 문자열을 다시 정수형으로 변환합니다.
        int result1 = Integer.parseInt("" + a + b);

        // 두 번째 연산: 2 * a * b를 계산합니다.
        int result2 = 2 * a * b;

        // 두 연산 결과(result1과 result2)를 비교하여 더 큰 값을 반환합니다.
        // 만약 두 값이 같다면 result1을 반환해야 하므로, >= (크거나 같다)를 사용합니다.
        if (result1 >= result2) {
            // result1이 result2보다 크거나 같으면 result1을 반환합니다.
            return result1;
        } else {
            // 그렇지 않으면 result2를 반환합니다.
            return result2;
        }
    }
}