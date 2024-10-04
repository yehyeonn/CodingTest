package Day64._1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = N;
        int cnt = 0;

        while(true)  {
            // 십의 자리 수 : (N % 10) * 10;
            // 일의 자리 수 : (N / 10 + N % 10) % 10
            N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
            cnt++;
            if(result == N) break;
        }

        System.out.println(cnt);
    }
}