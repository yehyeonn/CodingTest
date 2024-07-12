package Day01._2501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= num1; i++) {
            if(num1 % i == 0) cnt++;
            if(cnt == num2) {
                System.out.println(i);
                break;
            }
        }
        if(cnt <  num2) System.out.println(0);

        sc.close();
    }
}
