package Day63._2979;

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

        int[] arr = new int[100];
        int start = 0;
        int end = 0;
        int min = 100;
        int max = 0;

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            min = Math.min(min, start);
            max = Math.max(max, end);

            for(int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        int fee = 0;
        for(int i = min; i< max; i++) {
            switch (arr[i]) {
                case 1:
                    fee += A * arr[i];
                    break;
                case 2:
                    fee += B * arr[i];
                    break;
                case 3:
                    fee += C * arr[i];
                    break;
            }
        }
        System.out.println(fee);
    }
}
