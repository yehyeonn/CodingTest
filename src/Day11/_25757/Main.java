package Day11._25757;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        int players = 0;

        switch (game) {
            case ("Y"):
                players = 1;
                break;
            case ("F"):
                players = 2;
                break;
            case ("O"):
                players = 3;
                break;
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        System.out.println(set.size() / players);
    }
}