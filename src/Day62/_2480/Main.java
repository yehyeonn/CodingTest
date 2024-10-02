package Day62._2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A==B) {
            if(B==C) System.out.println(10000+(A)*1000);    // 3개 다 같을 때
            else System.out.println(1000+(A)*100);      // A B만 같을 때
        } else {    // A랑 B가 같지 않을 때
            if(B == C) System.out.println(1000+(B)*100);    // B C가 같을 때
            else if(A == C) System.out.println(1000+(A)*100);
            else System.out.println(Math.max(C, (Math.max(A, B))) * 100);   // A, B, C가 다 다를 때
        }
    }
}
