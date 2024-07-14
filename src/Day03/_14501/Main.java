package Day03._14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 일하는 날짜 수
        int num = Integer.parseInt(br.readLine());

        int[] day = new int[num+1];
        int[] pay = new int[num+1];
        int[] DP = new int[num +2];

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            day[i] = Integer.parseInt(st.nextToken());  // 상담에 걸리는 일 수
            pay[i] = Integer.parseInt(st.nextToken());  // 돈
        }

        for (int i = num; i > 0; i--) {
            int nextDay = i + day[i];   // 현재 일을 끝내고 다음 일을 할 수 있는 날짜

            if(nextDay > num + 1) {  // 그 다음 일을 할 수 있는 날짜가 일하기로 한 날의 수보다 크면
                // 다음 날 수익도 같은 수익
                DP[i] = DP[i +1];
            } else {    // 일할 수 있으면
                // 1. 일하지 않을 경우 DP[i +1]
                // 2. 일하고 해당 작업의 수익을 다음 가능한 날 이후의 최대 수익에 더하는 경우(pay[i] + DP[nextDay])
                // 이 중 더 큰 수를 DP에 저장
                DP[i] = Math.max(DP[i + 1], pay[i] + DP[nextDay]);
            }
        }

        System.out.println(DP[1]);  // 첫날부터 근무일까지 출력
    }
}
