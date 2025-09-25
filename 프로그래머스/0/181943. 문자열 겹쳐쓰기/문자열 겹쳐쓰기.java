class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // 1. my_string의 앞부분을 잘라냅니다. (0부터 s-1까지)
        String prefix = my_string.substring(0, s);
        
        // 2. 겹쳐 쓸 overwrite_string을 준비합니다.
        
        // 3. my_string의 뒷부분을 잘라냅니다. (s + overwrite_string의 길이부터 끝까지)
        String suffix = my_string.substring(s + overwrite_string.length());
        
        // 4. 세 부분을 연결하여 최종 문자열을 만듭니다.
        answer = prefix + overwrite_string + suffix;
        
        return answer;
    }
}