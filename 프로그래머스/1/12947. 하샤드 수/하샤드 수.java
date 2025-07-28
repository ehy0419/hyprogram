class Solution {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        int temp = x;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return x % sumOfDigits == 0;
    }
}
// 해당 코드는 입력받은 정수 x의 각 자릿수의 합을 구하고, x가 자릿수의 합으로 나누어 떨어지는지 판별하여 결과를 반환합니다.
// 코드 설명
//sumOfDigits 변수를 0으로 초기화하여 자릿수 합을 저장할 공간을 마련합니다.
//temp 변수를 x로 초기화하여 원본 x를 변경하지 않고 반복문을 돌릴 수 있도록 합니다.
//while 반복문을 사용하여 temp가 0보다 클 동안 반복합니다.
//temp % 10 연산을 통해 temp의 마지막 자릿수를 가져와 sumOfDigits에 더합니다.
//temp /= 10 연산을 통해 temp의 마지막 자릿수를 제거합니다.
//x가 sumOfDigits로 나누어 떨어지는지 확인하여 결과를 반환합니다. 