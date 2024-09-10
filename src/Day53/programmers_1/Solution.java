package Day53.programmers_1;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termMap = new HashMap<>();
        for(String term : terms) {
            String[] termPart = term.split(" ");
            termMap.put(termPart[0], Integer.parseInt(termPart[1]));
        }

        String[] todayInfo = today.split("\\.");

        int todayYear = Integer.parseInt(todayInfo[0]);
        int todayMon = Integer.parseInt(todayInfo[1]);
        int todayDay = Integer.parseInt(todayInfo[2]);


        List<Integer> expired = new ArrayList<>();

        for(int i =0; i <privacies.length; i++){
            String[] info = privacies[i].split(" ");
            String[] dateInfo = info[0].split("\\.");

            int year = Integer.parseInt(dateInfo[0]);
            int month = Integer.parseInt(dateInfo[1]);
            int day = Integer.parseInt(dateInfo[2]);

            int calcYear = year;
            int calcMon = month + termMap.get(info[1]);
            int calcDay = day;

            while (calcMon > 12) {
                calcYear += 1;
                calcMon -= 12;
            }

            if (calcYear < todayYear || (calcYear == todayYear && calcMon < todayMon) ||
                    (calcYear == todayYear && calcMon == todayMon && calcDay <= todayDay))
            {
                expired.add(i + 1);
            }

        }

        int[] answer = new int[expired.size()];
        for(int i =0; i<expired.size(); i++){
            answer[i] = expired.get(i);
        }
        return answer;
    }
}
