import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 결과를 저장할 배열을 commands의 길이만큼 생성
        int[] answer = new int[commands.length];

        // commands의 각 행에 대해 반복
        for(int i=0; i < commands.length; i++) {
            // commands[i]에서 i, j, k 값을 가져옴 (1부터 시작하므로 -1 해줌)
            int start = commands[i][0] - 1;
            int end = commands[i][1]; // end는 포함하지 않는 인덱스이므로 그대로 사용
            int k = commands[i][2] - 1; // k번째 숫자는 k-1 인덱스

            // 1. 배열 자르기
            // Math.max(0, start)는 start가 음수가 될 수 있으므로 0으로 처리
            // Math.min(array.length, end)는 end가 배열 범위를 벗어나지 않도록 처리
            int[] slicedArray = Arrays.copyOfRange(array, start, end);

            // 2. 배열 정렬하기
            Arrays.sort(slicedArray);

            // 3. k번째 숫자 추출
            answer[i] = slicedArray[k];
        }

        // 4. 결과 반환
        return answer;
    }
}