package Day68._5585;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cost = 1000 - Integer.parseInt(br.readLine());
        int[] coin = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        for(int i = 0; i < coin.length; i++) {
            if(cost/coin[i] > 0) {
                cnt += cost/coin[i];
                cost %= coin[i];
            }
        }
        System.out.print(cnt);
    }
}
