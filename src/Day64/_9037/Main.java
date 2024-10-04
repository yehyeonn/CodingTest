package Day64._9037;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int N, cnt;
        int[] arr;

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            cnt = 0;
            while (true) {
                arr = checkCandy(arr);
                if(sameCandy(arr)) break;
                arr = roundCandy(arr);
                cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int[] checkCandy(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 2 == 1 ? arr[i]+=1 : arr[i];
        }
        return arr;
    }

    private static boolean sameCandy(int[] arr) {
        for(int candy : arr) {
            if(candy != arr[0]) return false;
        }
        return true;
    }

    private static int[] roundCandy(int[] arr) {
        int length = arr.length;

        int[] arr2 = new int[length];

        for (int i = 0; i < length; i++) {
            arr2[(i + 1) % length] = arr[i] / 2 + arr[(i + 1) % length] / 2;
        }
        return arr2;
    }
}
