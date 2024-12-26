package Day79.LeetCode._12;

class Solution {
    public String intToRoman(int num) {
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            while(num >= arr[i]) {
                answer += rom[i];
                num -= arr[i];
            }
        }
        return answer;
    }
}