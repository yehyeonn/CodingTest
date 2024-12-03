package Day68._13458;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long answer = 0;
        answer += n;    // 총 감독관

        for (int i = 0; i < n; i++) {
            arr[i] -= b;    // 총 감독관 응시자 수
            if(arr[i] <= 0) continue;
            answer += arr[i] / c;
            if(arr[i] % c != 0) answer++;
        }
        System.out.print(answer);
    }
}
