package Day67._2745;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int ans = 0;
        for(int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if(c >= 'A' && c <= 'Z') ans += (c - 55) * tmp; // 알파벳 -> 숫자(A = 10 ... Z = 35)
            else ans += (c - 48) * tmp; // 숫자(형 문자열) -> 숫자
            tmp *= b;   //가중치 적용 b 제곱
        }
        System.out.print(ans);
    }
}
