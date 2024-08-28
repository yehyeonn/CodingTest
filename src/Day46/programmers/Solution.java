package Day46.programmers;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(String x : X.split("")) {
            xArr[Integer.parseInt(x)]++;
        }

        for(String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }

        for(int i=9 ; i>=0; i--) {
            while(xArr[i] > 0 && yArr[i] > 0) {
                answer.append(i);

                xArr[i]--;
                yArr[i]--;
            }
        }

        if(answer.toString().equals("")) return "-1";
        if(answer.toString().substring(0, 1).equals("0")) return "0";

        return answer.toString();
    }
}
