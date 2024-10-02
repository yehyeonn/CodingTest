package Day62.programmers;

import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        Stack<Integer> del = new Stack<>();
        Stack<Integer> pick = new Stack<>();

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < deliveries[i]; j++) {
                del.push(i + 1);
            }
            for (int j = 0; j < pickups[i]; j++) {
                pick.push(i + 1);
            }
        }

        while(!del.isEmpty() && !pick.isEmpty()) {
            int lastDel = del.peek();
            int lastPick = pick.peek();

            for (int i = 0; i < cap; i++) {
                if (!del.isEmpty()) del.pop();
                if (!pick.isEmpty()) pick.pop();
            }

            answer += Math.max(lastDel, lastPick) * 2L;
        }

        while (!del.isEmpty()) {
            int last = del.peek();

            for (int i = 0; i < cap; i++) {
                if (!del.isEmpty()) del.pop();
            }

            answer += last * 2L;
        }

        while (!pick.isEmpty()) {
            int last = pick.peek();

            for (int i = 0; i < cap; i++) {
                if (!pick.isEmpty()) pick.pop();
            }

            answer += last * 2L;
        }
        return answer;
    }
}