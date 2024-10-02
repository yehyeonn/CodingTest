package Day62._15953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int price = 0;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            switch (a) {
                case 1 :
                    price += 5000000;
                    break;
                case 2:
                case 3:
                    price += 3000000;
                    break;
                case 4:
                case 5:
                case 6:
                    price += 2000000;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    price += 500000;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    price += 300000;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    price += 100000;
                    break;
            }

            switch (b) {
                case 1:
                    price += 5120000;
                    break;
                case 2:
                case 3:
                    price += 2560000;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    price += 1280000;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    price += 640000;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    price += 320000;
                    break;
            }
            System.out.println(price);
            price = 0;
        }
    }
}