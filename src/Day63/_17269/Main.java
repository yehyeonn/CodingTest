package Day63._17269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] alphabet = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder newStr = new StringBuilder();
        int minLength = Math.min(N, M);

        for (int i = 0; i < minLength; i++) {
            newStr.append(A.charAt(i)).append(B.charAt(i));
        }

        if(N > M) newStr.append(A.substring(M));
        else if(N < M) newStr.append(B.substring(N));

        int[] arr = new int[newStr.length()];
        for (int i = 0; i < newStr.length(); i++) {
            arr[i] = alphabet[newStr.charAt(i) - 65];
        }

        while(arr.length > 2) {
            int[] arr2 = new int[arr.length - 1];
            for(int i = 0; i < arr.length -1; i++) {
                arr2[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = arr2;
        }
        if(arr[0] == 0) System.out.println(arr[1] + "%");
        else System.out.println(arr[0] + "" + arr[1] + "%");
    }
}

