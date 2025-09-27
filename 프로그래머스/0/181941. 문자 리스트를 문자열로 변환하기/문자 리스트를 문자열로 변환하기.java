class Solution {
    public String solution(String[] arr) {
        // for-each 문
        // 결과를 저장할 빈 문자열 변수를 선언합니다.
        String answer = ""; 

        // 입력받은 문자열 배열(arr)의 각 원소를 순서대로 반복합니다.
        // for-each 문을 사용하여 배열의 각 문자열을 's'에 할당합니다.
        for (String s : arr) {
            // 현재 문자열 's'를 answer 변수에 이어 붙입니다.
            // 자바에서 문자열 덧셈은 새로운 문자열 객체를 생성하므로,
            // 성능이 중요한 경우에는 StringBuilder를 사용하는 것이 더 효율적입니다.
            answer += s;
        }

        // 모든 문자를 이어 붙인 최종 문자열을 반환합니다.
        return answer;
    }
}