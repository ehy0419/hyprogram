import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // concat() 메서드를 사용하여 문자열 연결
        String result = a.concat(b);
        System.out.println(result);
        
        sc.close();
    }
}