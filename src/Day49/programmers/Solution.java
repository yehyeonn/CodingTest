package Day49.programmers;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for(String s: keymap) {
            for(int i = 0; i < s.length(); i++) {
                char k = s.charAt(i);
                int v = map.getOrDefault(k, i+1);

                map.put(k, Math.min(v, i+1));
            }
        }

        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                char k = targets[i].charAt(j);

                if(map.containsKey(k)) answer[i] += map.get(k);
                else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
