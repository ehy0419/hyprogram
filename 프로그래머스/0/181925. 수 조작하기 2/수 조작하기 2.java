class Solution {
    public String solution(int[] numLog) {
        // 결과로 반환할 제어 문자열 (조작 기록)
        String control = "";

        // numLog 배열은 조작된 수의 변화를 순서대로 기록한 배열
        // 따라서 인접한 두 수의 차이를 비교하여 어떤 조작이 있었는지 알 수 있음
        for (int i = 1; i < numLog.length; i++) {
            // 이전 값과 현재 값의 차이를 계산하여 조작 방향 판별
            int diff = numLog[i] - numLog[i - 1];
            
            if (diff == 1)
                // +1 → 'w' (위로 이동)
                control += 'w';
            else if (diff == -1)
                // -1 → 's' (아래로 이동)
                control += 's';
            else if (diff == 10)
                // +10 → 'd' (오른쪽으로 이동)
                control += 'd';
            else
                // -10 → 'a' (왼쪽으로 이동)
                control += 'a';
        }

        // 조작된 결과를 문자열로 반환
        return control;
    }
}
