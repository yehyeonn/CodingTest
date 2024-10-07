package Day65.programmers;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")) {
            answer[0]++;
            int zero = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') zero++;
            }

            answer[1] += zero;
            int one = s.length() - zero;
            s = Integer.toBinaryString(one);
        }

        return answer;
    }
}
