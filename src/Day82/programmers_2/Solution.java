package Day82.programmers_2;

import java.util.*;
class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int last = num_list[num_list.length - 1];
        int lastB = num_list[num_list.length - 2];

        for(int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        if(last > lastB) answer.add(last-lastB);
        else answer.add(last*2);
        return answer;
    }
}