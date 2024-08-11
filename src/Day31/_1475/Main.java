package Day31._1475;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] plastic = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));

            if(num == 6) plastic[9]++;
            else plastic[num]++;
        }
        if(plastic[9] % 2 == 1) plastic[9] = plastic[9]/2 +1;
        else plastic[9] = plastic[9]/2;

        Arrays.sort(plastic);

        System.out.println(plastic[9]);
    }
}