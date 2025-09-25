import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 덧셈식 출력
        System.out.println(a + " + " + b + " = " + (a + b));

        sc.close(); // Scanner 닫기 (선택 사항)
    }
}