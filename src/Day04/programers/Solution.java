package Day04.programers;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(String player : callings) {
            int num = map.get(player);
            String frontPlayer = players[num -1];

            players[num - 1] = player;
            players[num] = frontPlayer;

            map.put(player, num-1);
            map.put(frontPlayer, num);
        }

        return players;
    }
}