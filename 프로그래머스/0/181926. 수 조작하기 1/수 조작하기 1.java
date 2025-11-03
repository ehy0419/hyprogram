class Solution {
    public int solution(int n, String control) {
        // control 문자열의 각 문자를 하나씩 확인하면서 n의 값을 조작
        for(int i = 0; i < control.length(); i++) {
            // 현재 위치의 문자(char)를 가져와 switch문으로 분기
            switch(control.charAt(i)) {
                case 'w':
                    // 'w' → n을 1 증가
                    n += 1;
                    break;
                case 's':
                    // 's' → n을 1 감소
                    n -= 1;
                    break;
                case 'd':
                    // 'd' → n을 10 증가
                    n += 10;
                    break;
                case 'a':
                    // 'a' → n을 10 감소
                    n -= 10;
                    break;
            }
        }
        // 조작이 모두 끝난 후의 n 값을 반환
        return n;
    }
}
