package Day12.programmers;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for(int i = 0 ; i < numbers.length ; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a1, a2) -> (a2 +  a1).compareTo(a1 + a2));

        if(arr[0].equals("0")) {    // 시작이 0 => 전부 0
            return "0";
        }

        return String.join("", arr);
    }
}