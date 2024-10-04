package Day64._11655;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isLetter(c)) {
                sb.append(c);
                continue;
            }
            int n = (int)c + 13;
            if(Character.isUpperCase(c) && n > 90) n -= 26;
            if(Character.isLowerCase(c) && n > 122) n -= 26;

            sb.append((char) n);
        }
        System.out.println(sb);
    }
}
