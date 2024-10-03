package Day63._2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String s = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]+1) s = "descending";
            else if(arr[i] == arr[i + 1]-1) s = "ascending";
            else {
                s = "mixed";
                break;
            }
        }
        System.out.println(s);
    }
}