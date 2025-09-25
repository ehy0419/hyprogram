import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // n을 2로 나눈 나머지가 0인지 확인
        if (n % 2 == 0) {
            // 나머지가 0이면 짝수
            System.out.println(n + " is even");
        } else {
            // 나머지가 0이 아니면 홀수
            System.out.println(n + " is odd");
        }
        
        sc.close();
    }
}