import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수를 저장할 리스트 생성
        List<Integer> oddNumbers = new ArrayList<>();

        // 1부터 n까지 반복하며 홀수인지 확인
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // 2로 나누었을 때 나머지가 0이 아니면 홀수
                oddNumbers.add(i); // 홀수를 리스트에 추가
            }
        }

        // 리스트를 int 배열로 변환하여 반환
        int[] answer = new int[oddNumbers.size()];
        for (int i = 0; i < oddNumbers.size(); i++) {
            answer[i] = oddNumbers.get(i);
        }
        return answer;
    }
}