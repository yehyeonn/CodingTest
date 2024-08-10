package Day30._2108;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }
        Arrays.sort(num);

        int[] arr = new int[8001];
        for (int i = 0; i < n; i++) {
            if(num[i] < 0) arr[num[i] * (-1) + 4000]++;
            else arr[num[i]]++;
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt<arr[i]) cnt = arr[i];
        }

        int same = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(cnt==arr[i]) {
                same++;
                if(i<4001)arrayList.add(i);
                else arrayList.add((-1) * i + 4000);
            }
        }
        Collections.sort(arrayList);

        System.out.println(Math.round(sum/n));
        System.out.println(num[n/2]);
        if(same==1) System.out.println(arrayList.get(0));
        else if(same >1) System.out.println(arrayList.get(1));

        System.out.println(num[n-1]-num[0]);
    }
}
