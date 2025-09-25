class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();  // 1. StringBuilder 객체 생성
        for (char c : my_string.toCharArray()) { // 2. 문자열 순회 (문자 배열로 변환)
            for (int i = 0; i < n; i++) {        // 3. 각 문자를 n번 반복
                sb.append(c);                    // 4. 반복된 문자 추가
            }
        }
        return sb.toString();                    // 5. String으로 변환하여 반환
    }
}