import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) sb.append('*');
            if (i < n) sb.append('\n'); // 마지막 줄에 개행 없음 (A와 동일)
        }

        System.out.print(sb.toString());
        sc.close();
    }
}