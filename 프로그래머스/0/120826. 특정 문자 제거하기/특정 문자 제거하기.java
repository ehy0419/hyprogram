class Solution {
    public String solution(String my_string, String letter) {
        // letter에 해당하는 문자를 ""로 대체합니다.
        String answer = my_string.replace(letter, ""); 
        return answer;
    }
}