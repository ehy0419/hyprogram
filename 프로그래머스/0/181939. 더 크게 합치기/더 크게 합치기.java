class Solution {
    public int solution(int a, int b) {
        // 정수 a와 b를 문자열로 변환하여 두 가지 조합을 만듭니다.
        // String.valueOf() 메서드를 사용하여 정수를 문자열로 변환합니다.
        String str_ab = String.valueOf(a) + String.valueOf(b);
        String str_ba = String.valueOf(b) + String.valueOf(a);

        // 생성된 두 문자열을 다시 정수로 변환합니다.
        // Integer.parseInt() 메서드를 사용하여 문자열을 정수로 변환합니다.
        int num_ab = Integer.parseInt(str_ab);
        int num_ba = Integer.parseInt(str_ba);

        // 두 정수 값을 비교하여 더 큰 값을 반환합니다.
        // 만약 두 값이 같으면 문제 조건에 따라 a + b 형태의 값을 반환합니다.
        if (num_ab >= num_ba) {
            return num_ab;
        } else {
            return num_ba;
        }
    }
}