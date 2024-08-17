package Day36.programmers;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);
        for(int max = people.length -1; max >= min; max--) {
            if(people[min] + people[max] <= limit) min++;
            answer++;
        }
        return answer;
    }
}
