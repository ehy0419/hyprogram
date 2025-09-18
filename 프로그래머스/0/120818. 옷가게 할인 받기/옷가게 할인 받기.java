class Solution {
    public int solution(int price) {
        double discountRate = 0.0; // 할인율 초기화

        if (price >= 500000) {
            discountRate = 0.20; // 20% 할인
        } else if (price >= 300000) {
            discountRate = 0.10; // 10% 할인
        } else if (price >= 100000) {
            discountRate = 0.05; // 5% 할인
        }

        // 할인된 가격 계산 및 정수로 반환
        return (int) (price * (1 - discountRate));
    }
}