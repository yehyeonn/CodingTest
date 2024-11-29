package Day67._2587;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int avg = 0;

        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            avg += arr[i];
        }

        Arrays.sort(arr);
        System.out.print(avg/5 + "\n" + arr[2]);
    }
}
