package Day47._4673;

public class Main {
    public static void main(String[] args) {
        boolean[] b = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if(n < 10001) b[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if(!b[i]) System.out.println(i);
        }
    }

    private static int d(int i) {
        int sum = i;

        while (i != 0) {
            sum = sum + (i % 10);
            i = i / 10;
        }
        return sum;
    }
}
