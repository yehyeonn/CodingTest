package Day61.programers2;

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[][] test = {
                {"R", "T"},
                {"C", "F"},
                {"J", "M"},
                {"A", "N"}
        };

        int[] score = {3, 2, 1, 0, 1, 2, 3};
        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i<survey.length; i++) {
            String str = survey[i];
            if(choices[i] < 4) {
                String s = String.valueOf(str.charAt(0));
                map.put(s, map.getOrDefault(s, 0) + score[choices[i]-1]);
            } else {
                String s = String.valueOf(str.charAt(1));
                map.put(s, map.getOrDefault(s, 0) + score[choices[i]-1]);
            }
        }

        for(int i =0; i < 4; i++) {
            if(map.getOrDefault(test[i][0], 0) >= map.getOrDefault(test[i][1], 0)) {
                answer += test[i][0];
            } else answer += test[i][1];
        }

        return answer;
    }
}
