package Day64._2816;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for(int i = 0; i < N; i++) {
            if(arr[i].equals("KBS1")) {
                String tmp = "";
                for(int j = i; j > 0; j--) {
                    System.out.print(4);
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            } else System.out.print(1);
        }
        if(arr[1].equals("KBS2")) System.exit(0);

        for(int i = 0; i < N; i++) {
            if(arr[i].equals("KBS2")) {
                String tmp = "";
                for(int j = i; j> 1; j--) {
                    System.out.print(4);
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            } else System.out.print(1);
        }
    }
}
