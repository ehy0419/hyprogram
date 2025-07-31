class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(("Kim").equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }
}

//seoul[i].equals("Kim")
//→ seoul[i]가 null일 경우 NullPointerException 발생

//("Kim").equals(seoul[i])
//→ "Kim"은 절대 null이 아니기 때문에 null 안전(null-safe)