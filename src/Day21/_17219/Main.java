package Day21._17219;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();

            memo.put(site, pw);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String site = br.readLine();
            sb.append(memo.get(site) + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
