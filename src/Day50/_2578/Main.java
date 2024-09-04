package Day50._2578;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[5][5];

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // 카운터 배열 초기화
        int[] rowCnt = new int[5];
        int[] colCnt = new int[5];
        int diag1Cnt = 0, diag2Cnt = 0;

        // 사회자가 부르는 숫자 처리
        int bingo = 0;
        outer: for (int call = 1; call <= 25; call++) {
            int number = sc.nextInt();

            // 숫자 위치 찾기
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j] == number) {
                        // 해당 숫자의 위치에 따라 카운터 업데이트
                        if (++rowCnt[i] == 5) bingo++;
                        if (++colCnt[j] == 5) bingo++;
                        if (i == j && ++diag1Cnt == 5) bingo++;
                        if (i + j == 4 && ++diag2Cnt == 5) bingo++;

                        // 빙고 3줄 이상이면 출력하고 종료
                        if (bingo >= 3) {
                            System.out.println(call);
                            break outer;
                        }
                    }
                }
            }
        }

        sc.close();
    }
}