package Day64._10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }

        int n = word.length() / 2;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == arr[arr.length - i -1]) cnt++;
            else {
                cnt = 0;
                break;
            }
        }
        if(cnt == n) System.out.println(1);
        else System.out.println(0);
    }
}
