package Day05._10773;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) stack.push(num);
            else stack.pop();
        }

        while (!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
