class Solution {
    public String solution(String my_string, int k) {
         // 결과를 저장할 빈 문자열을 선언합니다.
        String answer = "";

        // 정수 k번 만큼 반복하는 for 반복문을 작성합니다.
        // i는 0부터 k-1까지 증가합니다.
        for (int i = 0; i < k; i++) {
            // 현재 문자열 my_string을 answer 변수에 계속해서 이어 붙입니다.
            // 문자열 덧셈 연산자(+)는 내부적으로 새로운 String 객체를 생성하므로
            // 반복 횟수가 많아질수록 성능 저하가 발생할 수 있습니다.
            answer += my_string;
        }

        // 반복문이 종료되면 k번 반복된 최종 문자열을 반환합니다.
        return answer;
    }
}