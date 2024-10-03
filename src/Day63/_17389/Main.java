package Day63._17389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int score = 0;
        int bonus = 0;

        for(int i = 1; i <= N; i++) {
            if(s.charAt(i-1) == 'O') score += i + bonus++;
            else bonus = 0;
        }

        System.out.println(score);
    }
}