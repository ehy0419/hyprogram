class Solution {
     public int solution(int num) {
        return collatz((long) num, 0);  // long으로 형변환하여 시작
    }

    public int collatz(long num, int count) {
        if (num == 1) return count;              // 1에 도달 → 현재 count 반환
        if (count >= 500) return -1;             // 500번 초과 → 실패

        // 짝수면 /2, 홀수면 *3 + 1 후 재귀 호출
        return collatz((num % 2 == 0) ? num / 2 : num * 3 + 1, count + 1);
    }
}