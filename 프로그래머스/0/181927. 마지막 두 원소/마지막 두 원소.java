class Solution {
    public int[] solution(int[] num_list) {
        // 결과를 담을 배열을 선언 (기존 배열보다 크기가 1 더 큼)
        int[] answer = new int[num_list.length + 1];
        
        int last = 0; // 추가할 마지막 원소 값
        
        // 마지막 원소(num_list[num_list.length - 1])가
        // 그전 원소(num_list[num_list.length - 2])보다 큰 경우
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            // 두 원소의 차이를 마지막에 추가할 값으로 설정
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            // 그렇지 않은 경우, 마지막 원소의 두 배를 추가할 값으로 설정
            last = num_list[num_list.length - 1] * 2;
        }
        
        // 기존 배열의 모든 요소를 새로운 배열로 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        // 계산된 마지막 값을 새로운 배열의 마지막 위치에 추가
        answer[answer.length - 1] = last;
        
        // 완성된 배열 반환
        return answer;
    }
}
