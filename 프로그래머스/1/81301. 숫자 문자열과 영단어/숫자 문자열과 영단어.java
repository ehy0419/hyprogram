import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder answer = new StringBuilder();
        StringBuilder buf = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            } else {
                buf.append(c);
                if (map.containsKey(buf.toString())) {
                    answer.append(map.get(buf.toString()));
                    buf.setLength(0); // 버퍼 비우기
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}