package Day54.programmers;

class Solution {
    public boolean solution(int x) {

        String [] tmp = String.valueOf(x).split("");
        int sum = 0;
        for(String s:tmp) {
            sum += Integer.parseInt(s);
        }

        return x % sum == 0 ? true : false;
    }
}