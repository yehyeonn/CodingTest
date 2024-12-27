package Day80.LeetCode._58;

//import java.util.*;
//
//class Solution {
//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//
//        StringTokenizer st = new StringTokenizer(s, " ");
//        String answer = null;
//
//        while(st.hasMoreTokens()) {
//            answer = st.nextToken();
//        }
//
//        return answer.length();
//    }
//}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String st = str[str.length - 1];
        return st.length();
    }
}
