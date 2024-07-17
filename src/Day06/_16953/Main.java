package Day06._16953;

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

        int cnt = 0;
        while (true) {
            if(B == A) {
                cnt++;
                break;
            }
            if(B%2 == 0) {
                B = B / 2;
                cnt++;
            } else {
                String num = Integer.toString(B);
                if(num.charAt(num.length() -1) == '1') {
                    B = Integer.parseInt(num.substring(0, num.length() - 1));
                    if(B < A) {
                        cnt = -1;
                        break;
                    }
                    cnt++;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
