import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        String str = sc.next();              // 입력받은 문자열

        StringBuilder sb = new StringBuilder(); // 문자열을 효율적으로 다루기 위한 StringBuilder

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);             // 현재 문자 가져오기

            if (Character.isUpperCase(c)) {          // 대문자인 경우
                sb.append(Character.toLowerCase(c)); // 소문자로 변환하여 추가
            } else {                                 // 소문자인 경우
                sb.append(Character.toUpperCase(c)); // 대문자로 변환하여 추가
            }
        }

        System.out.println(sb.toString());           // 결과 출력
    }
}