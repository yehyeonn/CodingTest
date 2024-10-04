package Day64._1427;

import java.io.*;
import java.util.Arrays;

/*public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}*/

// 카운팅 정렬
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[10];

        while (n != 0) {
            cnt[n % 10]++;
            n /= 10;
        }

        for (int i = 9; i >= 0 ; i--) {
            while (cnt[i]-- > 0) System.out.print(i);
        }
    }
}