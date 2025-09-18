import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 List로 변환
        Integer[] tempArray = new Integer[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            tempArray[i] = num_list[i];
        }
        
        // List의 순서 뒤집기
        Collections.reverse(Arrays.asList(tempArray));
        
        // 다시 배열로 변환
        int[] reversedList = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reversedList[i] = tempArray[i];
        }
        return reversedList;
    }
}