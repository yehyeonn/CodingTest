package Day82.programmers;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while(true) {
            int minW = Math.min(wallet[0], wallet[1]);
            int maxW = Math.max(wallet[0], wallet[1]);
            int minB = Math.min(bill[0], bill[1]);
            int maxB = Math.max(bill[0], bill[1]);

            if(minB > minW || maxB > maxW) {
                if(bill[0] > bill[1]) bill[0] /= 2;
                else bill[1] /= 2;
                answer++;
            } else break;
        }
        return answer;
    }
}
