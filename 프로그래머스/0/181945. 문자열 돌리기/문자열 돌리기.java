import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 문자열의 길이만큼 반복
        for (int i = 0; i < a.length(); i++) {
            // charAt(i)를 이용해 i번째 문자를 가져옴
            System.out.println(a.charAt(i));
        }

        sc.close();
    }
}