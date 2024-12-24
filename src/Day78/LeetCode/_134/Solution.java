package Day78.LeetCode._134;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int total = 0;
        int answer = 0;

        for(int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
        }

        if(sumGas < sumCost) return -1;

        for(int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if(total < 0) {
                total = 0;
                answer = i + 1;
            }
        }
        return answer;
    }
}
