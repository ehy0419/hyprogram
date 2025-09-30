class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            // '1'을 만나면 모드 전환
            if (currentChar == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } 
            // '1'이 아닐 때
            else {
                // mode가 0일 때
                if (mode == 0) {
                    // idx가 짝수일 때만 추가
                    if (idx % 2 == 0) {
                        ret.append(currentChar);
                    }
                } 
                // mode가 1일 때
                else { // mode == 1
                    // idx가 홀수일 때만 추가
                    if (idx % 2 != 0) {
                        ret.append(currentChar);
                    }
                }
            }
        }

        // 결과가 빈 문자열이면 "EMPTY" 반환
        if (ret.length() == 0) {
            return "EMPTY";
        } 
        // 아니면 결과 반환
        else {
            return ret.toString();
        }
    }
}