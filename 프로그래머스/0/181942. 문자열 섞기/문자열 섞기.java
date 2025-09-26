class Solution {
    public String solution(String str1, String str2) {
        String answer = "";                 // 결과 문자열 초기화
        int length = str1.length();         // 두 문자열의 길이 (동일)

        for (int i = 0; i < length; i++) {  // 길이만큼 반복
            answer += str1.charAt(i);       // str1의 현재 문자 추가
            answer += str2.charAt(i);       // str2의 현재 문자 추가
        }

        return answer;                      // 완성된 문자열 반환
    }
}