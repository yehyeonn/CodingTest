package Day41.programmers_1;

class Solution {
    public String solution(String new_id) {
        // level 1
        String answer = new_id.toLowerCase();

        // level 2
        answer = answer.replaceAll("[^0-9a-z-_.]", "");

        // level 3
        answer = answer.replaceAll("\\.{2,}", ".");

        // level 4
        answer = answer.replaceAll("^\\.", "");
        answer = answer.replaceAll("\\.$", "");

        // level 5
        if(answer.equals("")) answer = "a";

        // level 6
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }

        // level 7
        if(answer.length()<=2) {
            char last = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += last;
            }
        }

        return answer;
    }
}

/* 시간 초과 났던 답

class Solution {
    public String solution(String new_id) {
        // level 1
        String answer = new_id.toLowerCase();

        // level 2
        answer = answer.replaceAll("[^0-9a-z-_.]", "");

        // level 3
        while(answer.contains("..")) answer.replace("..", ".");

        // level 4
        if(answer.charAt(0) =='.') answer = answer.substring(1);
        if(answer.length() > 0 && answer.charAt(answer.length() -1) == '.')
            answer = answer.substring(0, answer.length() - 1);

        // level 5
        if(answer.length() == 0) answer = "a";

        // level 6
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length() -1) == '.')
                answer = answer.substring(0, answer.length() - 1);
        }

        // level 7
        if (answer.length() == 1) {
            answer += String.valueOf(answer.charAt(0)) + String.valueOf(answer.charAt(0));
        } else if (answer.length() == 2) {
            answer += String.valueOf(answer.charAt(1));
        }

        return answer;
    }
}*/
