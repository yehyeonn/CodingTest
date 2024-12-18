package Day69.LeetCode._2825;

class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int idx1 = 0, idx2 = 0;

        while(idx1 < str1.length() && idx2 < str2.length()) {

            char c1 = str1.charAt(idx1);
            char c2 = str2.charAt(idx2);

            if(c1 == c2 || (c1 + 1 - 'a') % 26 + 'a' == c2) idx2++;

            idx1++;
        }
        return idx2 == str2.length();
    }
}