package Day14.programmers;

class Solution {
    public int solution(String t, String p) {
        long pLong = Long.parseLong(p);
        int answer = 0;

        for(int i = 0; i<= t.length() - p.length(); i++) {
            String tSub = t.substring(i, i + p.length());

            if(Long.parseLong(tSub) <= pLong) {
                answer++;
            }
        }

        return answer;
    }
}
