import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 1. 배열 정렬
        Arrays.sort(array);

        // 2. 배열 길이 확인
        int n = array.length;

        // 3. 중앙값 계산
        // n / 2 는 정수 나눗셈이므로, 홀수/짝수 모두 가운데 인덱스를 가리킴 (n=5이면 2, n=6이면 3)
        return array[n / 2];
    }
}