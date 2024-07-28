package Day17._1149;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (i > 0) {    // 두 번째 줄부터
                arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + R;
                arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + G;
                arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + B;
                continue;
            }
            arr[i][0] = R;
            arr[i][1] = G;
            arr[i][2] = B;
        }

        System.out.println(Math.min(arr[n-1][0], Math.min(arr[n-1][1], arr[n-1][2])));
    }
}