class Solution {
    public int solution(int a, int d, boolean[] included) {
        int total = 0; // 합계를 저장할 변수

        for (int i = 0; i < included.length; i++) {
            if (included[i]) { // included[i]가 true인 경우에만
                int term = a + (i * d); // 해당 항의 값을 계산
                total += term; // 합계에 더함
            }
        }
        return total;
    }
}