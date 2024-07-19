package Day08.programmers;

class Solution {
    public String solution(String my_string, int k) {
        String answer = my_string.repeat(k);

        return answer;
    }
}

class Solution2 {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i<k ; i++) {
            answer += my_string;
        }
        return answer;
    }
}