package Day83._1977;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 1; i * i <= N; i++) {
            if(i * i >= M) {
                min = Math.min(i*i, min);
                sum += i * i;
            }
        }

        if(sum == 0) System.out.print(-1);
        else System.out.print(sum + "\n" + min);
    }
}
