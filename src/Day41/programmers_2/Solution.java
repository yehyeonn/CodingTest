package Day41.programmers_2;

import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s);
        }

        long answer = Long.parseLong(sb.reverse().toString());

        return answer;
    }
}