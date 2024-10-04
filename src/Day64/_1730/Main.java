package Day64._1730;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[][] moveX = new boolean[N][N];
        boolean[][] moveY = new boolean[N][N];

        String s = br.readLine();

        int x = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'U':
                    if (y > 0) { // 위로 이동
                        moveY[y][x] = true;
                        moveY[y - 1][x] = true;
                        y--;
                    }
                    break;
                case 'D':
                    if (y < N - 1) { // 아래로 이동
                        moveY[y][x] = true;
                        moveY[y + 1][x] = true;
                        y++;
                    }
                    break;
                case 'L':
                    if (x > 0) { // 왼쪽으로 이동
                        moveX[y][x] = true;
                        moveX[y][x - 1] = true;
                        x--;
                    }
                    break;
                case 'R':
                    if (x < N - 1) { // 오른쪽으로 이동
                        moveX[y][x] = true;
                        moveX[y][x + 1] = true;
                        x++;
                    }
                    break;
            }
        }

        char[][] pan = new char[N][N];
        for(int i =0; i <N; i++) {
            for(int j =0; j <N; j++) {
                if(moveY[i][j] && moveX[i][j]) pan[i][j] = '+';
                else if(moveY[i][j]) pan[i][j] = '|';
                else if(moveX[i][j]) pan[i][j] = '-';
                else pan[i][j] = '.';
                System.out.print(pan[i][j]);
            }
            System.out.println();
        }

    }
}
