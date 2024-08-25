package Day43.programmers;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        ArrayList<Integer> aList = new ArrayList<>();
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++) {
            aList.add(Integer.parseInt(arr[i]));
        }

        answer = Collections.min(aList) + " " + Collections.max(aList);
        return answer;
    }
}