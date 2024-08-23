package Day42.programmers;

class Solution {
    boolean solution(String s) {
        int pcnt =0, ycnt =0;
        char[] arr = s.toCharArray();

        for(int i =0; i<arr.length; i++) {
            if(arr[i] =='p' || arr[i]=='P') pcnt++;
            else if(arr[i] =='y' || arr[i] == 'Y') ycnt++;
        }

        if(pcnt == ycnt) return true;
        else return false;
    }
}
