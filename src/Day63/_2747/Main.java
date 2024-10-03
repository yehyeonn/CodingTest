package Day63._2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num[] = new int[46];
        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= N; i++) {
            num[i] = num[i - 2] + num[i - 1];
        }
        System.out.println(num[N]);
    }
}