class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            // ; 빼먹음 아니면 ,으로 입력
        }
        
        answer = (double)result / numbers.length;
        // numbers 에서 s를 빼먹음
        return answer;
    }
}