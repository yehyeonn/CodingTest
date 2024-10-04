package Day64._2828;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());

        int start = 1;
        int end = M;
        int answer = 0;

        for (int i = 0; i < J; i++) {
            int now = Integer.parseInt(br.readLine());
            if(now < start) {
                answer += start - now;
                end -= start - now;
                start = now;
            } else if (end < now) {
                answer += now - end;
                start += now - end;
                end = now;
            }
        }
        System.out.println(answer);
    }
}
