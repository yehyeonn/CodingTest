package Day02._14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int cnt;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int[] operator = new int[4];
    public static int[] number;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cnt = Integer.parseInt(br.readLine());  // 맨 처음 받는 숫자의 개수

        number = new int[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // cnt 만큼 입력 들어온 숫자
        for (int i = 0; i < cnt; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 받기(4개)
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        fun(number[0], 1); // 처음 숫자로 함수 실행

        System.out.println(max);
        System.out.println(min);
    }

    public static void fun(int num, int index) {

        if(index == cnt) {  //마지막 인덱스라면
            max = Math.max(max, num);
            min = Math.min(min, num);

            return;
        }

        // 연산자 확인
        for (int i = 0; i < 4; i++) {
            // 연산자가 있을 경우
            if(operator[i] > 0) {
                // i 번째 operator 1개 감소
                operator[i]--;

                switch (i) {
                    case 0: // 덧셈
                        fun(num + number[index], index + 1);
                        break;
                    case 1: // 뺄셈
                        fun(num - number[index], index + 1);
                        break;
                    case 2: // 곱셈
                        fun(num * number[index], index + 1);
                        break;
                    case 3: // 나눗셈
                        fun(num / number[index], index + 1);
                        break;
                }
                // 다시 operator 증가
                operator[i]++;
            }
        }
    }
}
